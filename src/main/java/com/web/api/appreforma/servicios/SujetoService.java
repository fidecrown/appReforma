package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Sujeto;
import com.web.api.appreforma.repositorios.SujetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class SujetoService extends BaseServiceImpl<Sujeto, SujetoRepository> {
    public SujetoService(SujetoRepository baseRepository) {
        super(baseRepository);
    }
}
