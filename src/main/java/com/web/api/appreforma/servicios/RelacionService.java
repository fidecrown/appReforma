package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Cliente;
import com.web.api.appreforma.entidades.Relacion;
import com.web.api.appreforma.repositorios.ClienteRepository;
import com.web.api.appreforma.repositorios.RelacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class RelacionService implements BaseService<Relacion> {

    @Autowired
    private RelacionRepository repositorio;


    @Override
    @Transactional
    public List<Relacion> findAll() throws Exception {
        try {
            List<Relacion> lstRelacion = repositorio.findAll();
            return lstRelacion;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Relacion findById(Integer id) throws Exception {
        try {
            Optional<Relacion> relacion = repositorio.findById(id);
            return relacion.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Relacion save(Relacion entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Relacion update(Integer id, Relacion entidad) throws Exception {
        try {
            Optional<Relacion> opt = repositorio.findById(id);
            Relacion relacion = opt.get();
            relacion = repositorio.save(entidad);
            return relacion;
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
