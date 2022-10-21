package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.ClienteSujeto;
import com.web.api.appreforma.repositorios.ClienteSujetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteSujetoService implements BaseService<ClienteSujeto> {

    @Autowired
    private ClienteSujetoRepository repositorio;


    @Override
    @Transactional
    public List<ClienteSujeto> findAll() throws Exception {
        try {
            List<ClienteSujeto> lstClienteSujeto = repositorio.findAll();
            return lstClienteSujeto;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public ClienteSujeto findById(Integer id) throws Exception {
        try {
            Optional<ClienteSujeto> ClienteSujeto = repositorio.findById(id);
            return ClienteSujeto.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public ClienteSujeto save(ClienteSujeto entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public ClienteSujeto update(Integer id, ClienteSujeto entidad) throws Exception {
        try {
            Optional<ClienteSujeto> opt = repositorio.findById(id);
            ClienteSujeto clieSujeto = opt.get();
            clieSujeto = repositorio.save(entidad);
            return clieSujeto;
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
