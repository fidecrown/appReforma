package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Ente;
import com.web.api.appreforma.repositorios.EnteRepository;
import org.springframework.stereotype.Service;

@Service
public class EnteService extends BaseServiceImpl<Ente, EnteRepository> {

    public EnteService(EnteRepository baseRepository) {
        super(baseRepository);
    }

}
