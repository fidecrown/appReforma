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

    @Transactional
    public void save(RegistroSIngreso entidad){
        try {
            /*
                OBTENEMOS LOS DATOS DE LA PANTALLA DE LA SOLICITUD DE INGRESO
                POSTERIORMENTE LO PERSISTIMOS EN LA BD
             */
            SolicitudIngreso soli = entidad.getSolicitudIngreso();
            soli.setNumero_solicitud(solicitudIngresoService.getNumeroSolicitud());
            soli = solicitudIngresoService.save(entidad.getSolicitudIngreso());
            /*
                OBTENEMOS LOS DATOS DE LA PANTALLA DEL PERFIL DEL CLIENTE
                POSTERIORMENTE LO PERSISTIMOS EN LA BD
             */
            PerfilCliente pc = entidad.getPerfilCliente();
            pc.setSolicitudIngreso(soli);
            perfilClienteService.save(pc);

            Ente ente = enteService.save(entidad.getEnte());

            Sujeto sujeto = entidad.getSujeto();
            sujeto.setEnte(ente);
            sujeService.save(sujeto);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
