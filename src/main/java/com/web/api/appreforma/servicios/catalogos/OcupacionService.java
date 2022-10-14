package com.web.api.appreforma.servicios.catalogos;

import com.web.api.appreforma.entidades.catalogos.Ciudad;
import com.web.api.appreforma.entidades.catalogos.Ocupacion;
import com.web.api.appreforma.repositorios.catalogos.OcupacionRepository;
import com.web.api.appreforma.servicios.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class OcupacionService implements BaseService<Ocupacion> {

    @Autowired
    private OcupacionRepository repositorio;

    @Override
    @Transactional
    public List<Ocupacion> findAll() throws Exception {
        try {
            List<Ocupacion> lstOcupaciones = repositorio.findAll();
            return lstOcupaciones;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Ocupacion findById(Integer id) throws Exception {
        try {
            Optional<Ocupacion> ocupacion = repositorio.findById(id);
            return ocupacion.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Ocupacion save(Ocupacion entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Ocupacion update(Integer id, Ocupacion entidad) throws Exception {
        try {
            Optional<Ocupacion> opt = repositorio.findById(id);
            Ocupacion ocupacion = opt.get();
            ocupacion = repositorio.save(entidad);
            return ocupacion;
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
}
