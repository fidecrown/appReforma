package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Ente;
import com.web.api.appreforma.repositorios.EnteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EnteService implements BaseService<Ente> {

    @Autowired
    private EnteRepository repositorio;

    @Override
    @Transactional
    public List<Ente> findAll() throws Exception {
        try {
            List<Ente> lstEntes = repositorio.findAll();
            return lstEntes;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Ente findById(Integer id) throws Exception {
        try {
            Optional<Ente> ente = repositorio.findById(id);
            return ente.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Ente save(Ente entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Ente update(Integer id, Ente entidad) throws Exception {
        try {
            Optional<Ente> opt = repositorio.findById(id);
            Ente ente = opt.get();
            ente = repositorio.save(entidad);
            return ente;
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
