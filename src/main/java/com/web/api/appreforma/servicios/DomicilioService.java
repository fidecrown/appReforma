package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Cliente;
import com.web.api.appreforma.entidades.Domicilio;
import com.web.api.appreforma.repositorios.ClienteRepository;
import com.web.api.appreforma.repositorios.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class DomicilioService implements BaseService<Domicilio> {

    @Autowired
    private DomicilioRepository repositorio;


    @Override
    @Transactional
    public List<Domicilio> findAll() throws Exception {
        try {
            List<Domicilio> lstDomicilio = repositorio.findAll();
            return lstDomicilio;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Domicilio findById(Integer id) throws Exception {
        try {
            Optional<Domicilio> domicilio = repositorio.findById(id);
            return domicilio.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Domicilio save(Domicilio entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Domicilio update(Integer id, Domicilio entidad) throws Exception {
        try {
            Optional<Domicilio> opt = repositorio.findById(id);
            Domicilio domicilio = opt.get();
            domicilio = repositorio.save(entidad);
            return domicilio;
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
