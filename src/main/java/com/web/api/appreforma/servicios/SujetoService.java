package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Sujeto;
import com.web.api.appreforma.repositorios.SujetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class SujetoService implements BaseService<Sujeto> {

    @Autowired
    private SujetoRepository repositorio;

    @Override
    @Transactional
    public List<Sujeto> findAll() throws Exception {
        try {
            List<Sujeto> lstSujetos = repositorio.findAll();
            return lstSujetos;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Sujeto findById(Integer id) throws Exception {
        try {
            Optional<Sujeto> sujeto = repositorio.findById(id);
            return sujeto.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Sujeto save(Sujeto entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Sujeto update(Integer id, Sujeto entidad) throws Exception {
        try {
            Optional<Sujeto> opt = repositorio.findById(id);
            Sujeto sujeto = opt.get();
            return repositorio.save(entidad);
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
