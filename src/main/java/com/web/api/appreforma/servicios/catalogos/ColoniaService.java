package com.web.api.appreforma.servicios.catalogos;

import com.web.api.appreforma.entidades.catalogos.Colonia;
import com.web.api.appreforma.repositorios.catalogos.ColoniaRepository;
import com.web.api.appreforma.servicios.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ColoniaService implements BaseService<Colonia> {

    @Autowired
    private ColoniaRepository repositorio;


    @Override
    @Transactional
    public List<Colonia> findAll() throws Exception {
        try {
            List<Colonia> lstColonia = repositorio.findAll();
            return lstColonia;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Colonia findById(Integer id) throws Exception {
        try {
            Optional<Colonia> colonia = repositorio.findById(id);
            return colonia.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Colonia save(Colonia entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Colonia update(Integer id, Colonia entidad) throws Exception {
        try {
            Optional<Colonia> opt = repositorio.findById(id);
            Colonia colonia = opt.get();
            colonia = repositorio.save(entidad);
            return colonia;
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
