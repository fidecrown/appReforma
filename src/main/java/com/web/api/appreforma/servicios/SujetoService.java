package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Sujeto;
import com.web.api.appreforma.repositorios.SujetoRepository;
import org.springframework.stereotype.Service;

@Service
public class SujetoService extends BaseServiceImpl<Sujeto, SujetoRepository> {

    public SujetoService(SujetoRepository baseRepository) {
        super(baseRepository);
    }

}
