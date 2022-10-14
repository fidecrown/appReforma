package com.web.api.appreforma.servicios.catalogos;

import com.web.api.appreforma.entidades.catalogos.Nacionalidad;
import com.web.api.appreforma.repositorios.catalogos.NacionalidadRepository;
import com.web.api.appreforma.servicios.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class NacionalidadService implements BaseService<Nacionalidad> {

    @Autowired
    private NacionalidadRepository repositorio;

    @Override
    @Transactional
    public List<Nacionalidad> findAll() throws Exception {
        try {
            List<Nacionalidad> lstNacion = repositorio.findAll();
            return lstNacion;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Nacionalidad findById(Integer id) throws Exception {
        try {
            Optional<Nacionalidad> nacion = repositorio.findById(id);
            return nacion.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Nacionalidad save(Nacionalidad entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Nacionalidad update(Integer id, Nacionalidad entidad) throws Exception {
        try {
            Optional<Nacionalidad> opt = repositorio.findById(id);
            Nacionalidad nac = opt.get();
            nac = repositorio.save(entidad);
            return nac;
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
