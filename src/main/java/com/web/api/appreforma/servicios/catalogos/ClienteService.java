package com.web.api.appreforma.servicios.catalogos;

import com.web.api.appreforma.entidades.catalogos.Cliente;
import com.web.api.appreforma.repositorios.catalogos.ClienteRepository;
import com.web.api.appreforma.servicios.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements BaseService<Cliente> {

    @Autowired
    private ClienteRepository repositorio;


    @Override
    @Transactional
    public List<Cliente> findAll() throws Exception {
        try {
            List<Cliente> lstClientes = repositorio.findAll();
            return lstClientes;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Cliente findById(Integer id) throws Exception {
        try {
            Optional<Cliente> cliente = repositorio.findById(id);
            return cliente.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Cliente save(Cliente entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Cliente update(Integer id, Cliente entidad) throws Exception {
        try {
            Optional<Cliente> opt = repositorio.findById(id);
            Cliente cliente = opt.get();
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
