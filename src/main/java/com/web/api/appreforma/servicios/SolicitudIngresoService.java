package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.SolicitudIngreso;
import com.web.api.appreforma.repositorios.SolicitudIngresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class SolicitudIngresoService implements BaseService<SolicitudIngreso> {

    @Autowired
    private SolicitudIngresoRepository repositorio;


    @Override
    @Transactional
    public List<SolicitudIngreso> findAll() throws Exception {
        try {
            List<SolicitudIngreso> lstSolicitudes = repositorio.findAll();
            return lstSolicitudes;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public SolicitudIngreso findById(Integer id) throws Exception {
        try {
            Optional<SolicitudIngreso> solIng = repositorio.findById(id);
            return solIng.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public SolicitudIngreso save(SolicitudIngreso entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public SolicitudIngreso update(Integer id, SolicitudIngreso entidad) throws Exception {
        try {
            Optional<SolicitudIngreso> opt = repositorio.findById(id);
            SolicitudIngreso solIng = opt.get();
            solIng = repositorio.save(entidad);
            return solIng;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Integer id) throws Exception {
        try {
            if(repositorio.existsById(id)){
                repositorio.deleteById(id);
                return true;
            }

            throw new Exception();

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public Integer getNumeroSolicitud() throws Exception {
        try {
            return repositorio.getNumeroSolicitud();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
