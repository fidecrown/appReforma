package com.web.api.appreforma.servicios.catalogos;

import com.web.api.appreforma.entidades.catalogos.Nacionalidades;
import com.web.api.appreforma.repositorios.catalogos.NacionalidadesRepository;
import com.web.api.appreforma.servicios.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class NacionalidadesService implements BaseService<Nacionalidades> {

    @Autowired
    private NacionalidadesRepository repositorio;

    @Override
    @Transactional
    public List<Nacionalidades> findAll() throws Exception {
        try {
            List<Nacionalidades> lstNacion = repositorio.findAll();
            return lstNacion;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Nacionalidades findById(Integer id) throws Exception {
        try {
            Optional<Nacionalidades> nacion = repositorio.findById(id);
            return nacion.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Nacionalidades save(Nacionalidades entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Nacionalidades update(Integer id, Nacionalidades entidad) throws Exception {
        try {
            Optional<Nacionalidades> opt = repositorio.findById(id);
            Nacionalidades nac = opt.get();
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
