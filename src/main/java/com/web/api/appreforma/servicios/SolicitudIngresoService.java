package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.SolicitudIngreso;
import com.web.api.appreforma.repositorios.SolicitudIngresoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SolicitudIngresoService extends BaseServiceImpl<SolicitudIngreso, SolicitudIngresoRepository>{

    public SolicitudIngresoService(SolicitudIngresoRepository baseRepository) {
        super(baseRepository);
    }

    @Transactional
    public Integer getNumeroSolicitud() throws Exception {
        try {
            return baseRepository.getNumeroSolicitud();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
