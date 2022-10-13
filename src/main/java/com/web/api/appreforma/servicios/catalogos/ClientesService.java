package com.web.api.appreforma.servicios.catalogos;

import com.web.api.appreforma.entidades.catalogos.Clientes;
import com.web.api.appreforma.repositorios.catalogos.ClientesRepository;
import com.web.api.appreforma.servicios.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClientesService implements BaseService<Clientes> {

    @Autowired
    private ClientesRepository repositorio;


    @Override
    @Transactional
    public List<Clientes> findAll() throws Exception {
        try {
            List<Clientes> lstClientes = repositorio.findAll();
            return lstClientes;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Clientes findById(Integer id) throws Exception {
        try {
            Optional<Clientes> cliente = repositorio.findById(id);
            return cliente.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Clientes save(Clientes entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Clientes update(Integer id, Clientes entidad) throws Exception {
        try {
            Optional<Clientes> opt = repositorio.findById(id);
            Clientes cliente = opt.get();
            cliente = repositorio.save(entidad);
            return cliente;
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
