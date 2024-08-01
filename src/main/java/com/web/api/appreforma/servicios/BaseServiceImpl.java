package com.web.api.appreforma.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public class BaseServiceImpl<E, R extends JpaRepository<E, Integer>> implements BaseService<E> {

    protected R baseRepository;
    public BaseServiceImpl(R baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try {
            List<E> lstEntidades = baseRepository.findAll();
            return lstEntidades;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(Integer id) throws Exception {
        try {
            //Optional<E> entidad = baseRepository.findById(id);
            return baseRepository.findById(id).get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entidad) throws Exception {
        try {
            return baseRepository.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(Integer id, E entidad) throws Exception {
        try {
            Optional<E> opt = baseRepository.findById(id);
            E entidadO = opt.get();
            entidadO = baseRepository.save(entidad);
            return entidadO;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Integer id) throws Exception {
        try {
            if(baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                return true;
            }

            throw new Exception();

        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
