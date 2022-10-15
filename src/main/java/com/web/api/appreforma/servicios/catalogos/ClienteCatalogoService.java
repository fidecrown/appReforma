package com.web.api.appreforma.servicios.catalogos;

import com.web.api.appreforma.entidades.catalogos.ClienteCatalogo;
import com.web.api.appreforma.repositorios.catalogos.ClienteCatalogoRepository;
import com.web.api.appreforma.servicios.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteCatalogoService implements BaseService<ClienteCatalogo> {

    @Autowired
    private ClienteCatalogoRepository repositorio;


    @Override
    @Transactional
    public List<ClienteCatalogo> findAll() throws Exception {
        try {
            List<ClienteCatalogo> lstClienteCatalogos = repositorio.findAll();
            return lstClienteCatalogos;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public ClienteCatalogo findById(Integer id) throws Exception {
        try {
            Optional<ClienteCatalogo> cliente = repositorio.findById(id);
            return cliente.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public ClienteCatalogo save(ClienteCatalogo entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public ClienteCatalogo update(Integer id, ClienteCatalogo entidad) throws Exception {
        try {
            Optional<ClienteCatalogo> opt = repositorio.findById(id);
            ClienteCatalogo clienteCatalogo = opt.get();
            clienteCatalogo = repositorio.save(entidad);
            return clienteCatalogo;
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
