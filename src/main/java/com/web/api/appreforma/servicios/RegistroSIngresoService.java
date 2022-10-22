package com.web.api.appreforma.servicios;

import ch.qos.logback.core.net.server.Client;
import com.web.api.appreforma.entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;

@Service
public class RegistroSIngresoService {

    @Autowired
    private SolicitudIngresoService solicitudIngresoService;
    @Autowired
    private PerfilClienteService perfilClienteService;
    @Autowired
    private EnteService enteService;
    @Autowired
    private SujetoService sujeService;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private ClienteSujetoService cliSujService;

    @Autowired
    private DomicilioService domicilioService;

    @Autowired
    private EmpresaTrabajaService empresaTrabajaService;

    @Autowired
    private TrabajaEnService trabajaEnService;

    @Autowired
    private RelacionService relacionService;

    @Transactional
    public void save(RegistroSIngreso entidad){
        try {
            /*
                OBTENEMOS LOS DATOS DE LA PANTALLA DE LA SOLICITUD DE INGRESO
                POSTERIORMENTE LO PERSISTIMOS EN LA BD
             */
            SolicitudIngreso soli = entidad.getSolicitudIngreso();
            soli.setNumero_solicitud(solicitudIngresoService.getNumeroSolicitud());
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
            cliente.setNumero_cliente(clienteService.getNumero_Cliente());
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

            /*********** COMIENZA EL APARTADO DE LA PANTALLA RELACION LABORAL **********/

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

            /*********** FIN  PANTALLA RELACION LABORAL **********/

            /*********** COMIENZA EL APARTADO DE LA PANTALLA RELACION CON EL CLIENTE **********/
            System.out.println("COMIENZA LA PANTALLA DE RELACIONES");
            Cliente clienteRelacion = null;
            Relacion relacion = entidad.getSolicitudRelaciones().getRelacion();
            Ente enteRelacion = null;
            Sujeto sujeRelacion = null;
            Domicilio domRelacion = null;

            System.out.println("PASO LOS NULLS ");


            if(entidad.getSolicitudRelaciones().getRelacionesCliente() != null){
                System.out.println("ENTRO AL CLIENTE ");
                clienteRelacion = entidad.getSolicitudRelaciones().getRelacionesCliente().getCliente();

                enteRelacion = enteService.save(entidad.getSolicitudRelaciones().getRelacionesCliente().getEnte());

                sujeRelacion = entidad.getSolicitudRelaciones().getRelacionesCliente().getSujeto();
                sujeRelacion.setEnte(enteRelacion);
                sujeRelacion = sujeService.save(sujeRelacion);

                domRelacion = entidad.getSolicitudRelaciones().getRelacionesCliente().getDomicilio();
                domRelacion.setEnte(enteRelacion);
                domRelacion = domicilioService.save(domRelacion);

                relacion.setCliente(clienteService.save(clienteRelacion));

            }else {
                System.out.println("ENTRO A LLENAR LA RELACION ");
                enteRelacion = enteService.save(entidad.getSolicitudRelaciones().getEnte());

                sujeRelacion = entidad.getSolicitudRelaciones().getSujeto();
                sujeRelacion.setEnte(enteRelacion);
                sujeRelacion = sujeService.save(sujeRelacion);

                domRelacion = entidad.getSolicitudRelaciones().getDomicilio();
                domRelacion.setEnte(enteRelacion);
                domRelacion = this.domicilioService.save(domRelacion);
            }
            System.out.println("LLENOS LOS FILTROS ");
            relacion.setSolicitudIngreso(soli);
            relacion.setSujeto(sujeRelacion);

            this.relacionService.save(relacion);

            /*********** FIN  PANTALLA RELACION CON EL CLIENTE **********/



        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
