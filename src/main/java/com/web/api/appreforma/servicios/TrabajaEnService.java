package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.TrabajaEn;
import com.web.api.appreforma.repositorios.TrabajaEnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TrabajaEnService implements BaseService<TrabajaEn> {

    @Autowired
    private TrabajaEnRepository repositorio;


    @Override
    @Transactional
    public List<TrabajaEn> findAll() throws Exception {
        try {
            List<TrabajaEn> lstTrabajaEn = repositorio.findAll();
            return lstTrabajaEn;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public TrabajaEn findById(Integer id) throws Exception {
        try {
            Optional<TrabajaEn> TrabajaEn = repositorio.findById(id);
            return TrabajaEn.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public TrabajaEn save(TrabajaEn entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public TrabajaEn update(Integer id, TrabajaEn entidad) throws Exception {
        try {
            Optional<TrabajaEn> opt = repositorio.findById(id);
            TrabajaEn TrabajaEn = opt.get();
            TrabajaEn = repositorio.save(entidad);
            return TrabajaEn;
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
