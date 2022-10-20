package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

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
            sujeService.save(sujeto);

            /*
                FORMAMOS LOS DATOS PARA LA TABLA CLIENTES
                POSTERIORMENTE LO PERSISTIMOS EN LA BD
             */
            Cliente cliente = entidad.getCliente();
            cliente.setNumero_cliente(clienteService.getNumero_Cliente());
            cliente.setSolicitudIngreso(soli);
            clienteService.save(cliente);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
