package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.*;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.logging.Logger;

@Service
public class RegistroSIngresoService {

    Logger logger = Logger.getLogger(getClass().getName());

    private final SolicitudIngresoService solicitudIngresoService;
    private final PerfilClienteService perfilClienteService;
    private final EnteService enteService;
    private final SujetoService sujeService;
    private final ClienteService clienteService;
    private final ClienteSujetoService cliSujService;
    private final DomicilioService domicilioService;
    private final EmpresaTrabajaService empresaTrabajaService;
    private final TrabajaEnService trabajaEnService;
    private final RelacionService relacionService;

    public RegistroSIngresoService(SolicitudIngresoService solicitudIngresoService, PerfilClienteService perfilClienteService, EnteService enteService, SujetoService sujeService, ClienteService clienteService, ClienteSujetoService cliSujService, DomicilioService domicilioService, EmpresaTrabajaService empresaTrabajaService, TrabajaEnService trabajaEnService, RelacionService relacionService) {
        this.solicitudIngresoService = solicitudIngresoService;
        this.perfilClienteService = perfilClienteService;
        this.enteService = enteService;
        this.sujeService = sujeService;
        this.clienteService = clienteService;
        this.cliSujService = cliSujService;
        this.domicilioService = domicilioService;
        this.empresaTrabajaService = empresaTrabajaService;
        this.trabajaEnService = trabajaEnService;
        this.relacionService = relacionService;
    }

    @Transactional(readOnly = true)
    public RegistroSIngreso getOne( Integer clienteId){
        RegistroSIngreso registroSolicitud = new RegistroSIngreso();

        try {

            Cliente cliente = clienteService.findById(clienteId);
            SolicitudIngreso solIngreso = solicitudIngresoService.findById(cliente.getSolicitudIngreso().getSolicitudid());
            PerfilCliente perfilCliente = perfilClienteService.findById(solIngreso.getSolicitudid());
            ClienteSujeto clienteSujeto = cliSujService.findById(cliente.getClienteid());
            Domicilio domicilio = domicilioService.findById(clienteSujeto.getSujeto().getEnte().getEnteid());
            TrabajaEn trabajaEn = trabajaEnService.findById(cliente.getSolicitudIngreso().getSolicitudid());

            SolicitudLaboral solicitudLaboral = new SolicitudLaboral();
            Domicilio domicilioLaboral = domicilioService.findById(trabajaEn.getEmpresaTrabaja().getEnte().getEnteid());
            solicitudLaboral.setTrabajaEn(trabajaEn);
            solicitudLaboral.setEmpresaTrabaja(trabajaEn.getEmpresaTrabaja());
            solicitudLaboral.setEnte(trabajaEn.getEmpresaTrabaja().getEnte());
            solicitudLaboral.setDomicilio(domicilioLaboral);

            SolicitudRelaciones solicitudRelaciones = new SolicitudRelaciones();
            Relacion relacion = relacionService.findById(solIngreso.getSolicitudid());
            Domicilio domicilioRelaciones = domicilioService.findById(relacion.getSujeto().getEnte().getEnteid());
            solicitudRelaciones.setRelacion(relacion);
            solicitudRelaciones.setEnte(relacion.getSujeto().getEnte());
            solicitudRelaciones.setSujeto(relacion.getSujeto());
            solicitudRelaciones.setDomicilio(domicilioRelaciones);


            registroSolicitud.setCliente(cliente);
            registroSolicitud.setSolicitudIngreso(solIngreso);
            registroSolicitud.setPerfilCliente(perfilCliente);
            registroSolicitud.setSujeto(clienteSujeto.getSujeto());
            registroSolicitud.setEnte(clienteSujeto.getSujeto().getEnte());
            registroSolicitud.setDomicilio(domicilio);
            registroSolicitud.setSolicitudLaboral(solicitudLaboral);
            registroSolicitud.setSolicitudRelaciones(solicitudRelaciones);

            return registroSolicitud;

        }catch (Exception e){
            throw new EntityNotFoundException("OCURRIO ALGUN ERROR");
        }

    }

    @Transactional
    public void save(RegistroSIngreso entidad){
        try {

            /*
                OBTENEMOS LOS DATOS DE LA PANTALLA DE LA SOLICITUD DE INGRESO
                POSTERIORMENTE LO PERSISTIMOS EN LA BD
             */
            SolicitudIngreso soli = entidad.getSolicitudIngreso();
            soli.setNumeroSolicitud(solicitudIngresoService.getNumeroSolicitud());
            soli = solicitudIngresoService.save(soli);
            /*
                OBTENEMOS LOS DATOS DE LA PANTALLA DEL PERFIL DEL CLIENTE
                POSTERIORMENTE LO PERSISTIMOS EN LA BD
             */
            PerfilCliente pc = entidad.getPerfilCliente();
            pc.setSolicitudIngreso(soli);
            perfilClienteService.save(pc);

            /*
                FORMAMOS LOS DATOS PARA LA TABLA ENTE
                POSTERIORMENTE LO PERSISTIMOS EN LA BD
             */
            Ente ente = enteService.save(entidad.getEnte());

            /*
                FORMAMOS LOS DATOS PARA LA TABLA SUJETOS
                POSTERIORMENTE LO PERSISTIMOS EN LA BD
             */
            Sujeto sujeto = entidad.getSujeto();
            sujeto.setEnte(ente);
            sujeto = sujeService.save(sujeto);

            /*
                FORMAMOS LOS DATOS PARA LA TABLA CLIENTES
                POSTERIORMENTE LO PERSISTIMOS EN LA BD
             */
            Cliente cliente = entidad.getCliente();
            cliente.setNumeroCliente(clienteService.getNumero_Cliente());
            cliente.setSolicitudIngreso(soli);
            cliente = clienteService.save(cliente);

            /*
                FORMAMOS LOS DATOS PARA LA TABLA CLIENTES_SUJETOS
                POSTERIORMENTE LO PERSISTIMOS EN LA BD
             */
            ClienteSujeto cs = new ClienteSujeto();
            cs.setSujeto(sujeto);
            cs.setCliente(cliente);

            cliSujService.save(cs);

            /*
                FORMAMOS LOS DATOS PARA LA TABLA DOMICILIOS
                POSTERIORMENTE LO PERSISTIMOS EN LA BD
             */
            Domicilio dm = entidad.getDomicilio();
            dm.setEnte(ente);
            this.domicilioService.save(dm);

            /* COMIENZA EL APARTADO DE LA PANTALLA RELACION LABORAL **********/

            Ente enteLaboral = enteService.save(entidad.getSolicitudLaboral().getEnte());

            EmpresaTrabaja et = entidad.getSolicitudLaboral().getEmpresaTrabaja();
            et.setEnte(enteLaboral);
            et = this.empresaTrabajaService.save(et);

            TrabajaEn tbe = entidad.getSolicitudLaboral().getTrabajaEn();
            tbe.setSolicitudIngreso(soli);
            tbe.setEmpresaTrabaja(et);

            this.trabajaEnService.save(tbe);

            Domicilio domLaboral = entidad.getSolicitudLaboral().getDomicilio();
            domLaboral.setEnte(enteLaboral);
            this.domicilioService.save(domLaboral);

            /* FIN  PANTALLA RELACION LABORAL **********/

            /* COMIENZA EL APARTADO DE LA PANTALLA RELACION CON EL CLIENTE **********/
            logger.info("COMIENZA LA PANTALLA DE RELACIONES");
            Cliente clienteRelacion;
            Relacion relacion = entidad.getSolicitudRelaciones().getRelacion();
            Ente enteRelacion;
            Sujeto sujeRelacion;
            Domicilio domRelacion;

            logger.info("PASO LOS NULLS ");


            if(entidad.getSolicitudRelaciones().getRelacionesCliente() != null){
                logger.info("ENTRO AL CLIENTE ");
                clienteRelacion = entidad.getSolicitudRelaciones().getRelacionesCliente().getCliente();

                enteRelacion = enteService.save(entidad.getSolicitudRelaciones().getRelacionesCliente().getEnte());

                sujeRelacion = entidad.getSolicitudRelaciones().getRelacionesCliente().getSujeto();
                sujeRelacion.setEnte(enteRelacion);
                sujeRelacion = sujeService.save(sujeRelacion);

                domRelacion = entidad.getSolicitudRelaciones().getRelacionesCliente().getDomicilio();
                domRelacion.setEnte(enteRelacion);
                this.domicilioService.save(domRelacion);

                relacion.setCliente(clienteService.save(clienteRelacion));

            }else {
                logger.info("ENTRO A LLENAR LA RELACION ");
                enteRelacion = enteService.save(entidad.getSolicitudRelaciones().getEnte());

                sujeRelacion = entidad.getSolicitudRelaciones().getSujeto();
                sujeRelacion.setEnte(enteRelacion);
                sujeRelacion = sujeService.save(sujeRelacion);

                domRelacion = entidad.getSolicitudRelaciones().getDomicilio();
                domRelacion.setEnte(enteRelacion);
                this.domicilioService.save(domRelacion);
            }
            logger.info("LLENOS LOS FILTROS ");
            relacion.setSolicitudIngreso(soli);
            relacion.setSujeto(sujeRelacion);

            this.relacionService.save(relacion);

            /* FIN  PANTALLA RELACION CON EL CLIENTE **********/

        } catch (Exception e) {
            throw new EntityNotFoundException("OCURRIO ALGUN ERROR");
        }
    }

}
