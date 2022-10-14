package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.PerfilCliente;
import com.web.api.appreforma.repositorios.PerfilClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PerfilClienteService implements BaseService<PerfilCliente> {

    @Autowired
    private PerfilClienteRepository repositorio;


    @Override
    @Transactional
    public List<PerfilCliente> findAll() throws Exception {
        try {
            List<PerfilCliente> lstperCliente = repositorio.findAll();
            return lstperCliente;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public PerfilCliente findById(Integer id) throws Exception {
        try {
            Optional<PerfilCliente> perfCliente = repositorio.findById(id);
            return perfCliente.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public PerfilCliente save(PerfilCliente entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public PerfilCliente update(Integer id, PerfilCliente entidad) throws Exception {
        try {
            Optional<PerfilCliente> opt = repositorio.findById(id);
            PerfilCliente prfCliente = opt.get();
            prfCliente = repositorio.save(entidad);
            return prfCliente;
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
