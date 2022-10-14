package com.web.api.appreforma.servicios.catalogos;

import com.web.api.appreforma.entidades.catalogos.Ciudad;
import com.web.api.appreforma.entidades.catalogos.Cliente;
import com.web.api.appreforma.repositorios.catalogos.CiudadRepository;
import com.web.api.appreforma.servicios.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CiudadService implements BaseService<Ciudad> {

    @Autowired
    private CiudadRepository repositorio;


    @Override
    @Transactional
    public List<Ciudad> findAll() throws Exception {
        try {
            List<Ciudad> lstCiudades = repositorio.findAll();
            return lstCiudades;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Ciudad findById(Integer id) throws Exception {
        try {
            Optional<Ciudad> ciudad = repositorio.findById(id);
            return ciudad.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Ciudad save(Ciudad entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Ciudad update(Integer id, Ciudad entidad) throws Exception {
        try {
            Optional<Ciudad> opt = repositorio.findById(id);
            Ciudad ciudad = opt.get();
            ciudad = repositorio.save(entidad);
            return ciudad;
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
