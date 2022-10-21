package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.EmpresaTrabaja;
import com.web.api.appreforma.repositorios.EmpresaTrabajaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmpresaTrabajaService implements BaseService<EmpresaTrabaja> {

    @Autowired
    private EmpresaTrabajaRepository repositorio;


    @Override
    @Transactional
    public List<EmpresaTrabaja> findAll() throws Exception {
        try {
            List<EmpresaTrabaja> lstet = repositorio.findAll();
            return lstet;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public EmpresaTrabaja findById(Integer id) throws Exception {
        try {
            Optional<EmpresaTrabaja> et = repositorio.findById(id);
            return et.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public EmpresaTrabaja save(EmpresaTrabaja entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public EmpresaTrabaja update(Integer id, EmpresaTrabaja entidad) throws Exception {
        try {
            Optional<EmpresaTrabaja> opt = repositorio.findById(id);
            EmpresaTrabaja et = opt.get();
            et = repositorio.save(entidad);
            return et;
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
