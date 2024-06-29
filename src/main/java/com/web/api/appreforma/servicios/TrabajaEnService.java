package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.TrabajaEn;
import com.web.api.appreforma.repositorios.TrabajaEnRepository;
import org.springframework.stereotype.Service;

@Service
public class TrabajaEnService extends BaseServiceImpl<TrabajaEn, TrabajaEnRepository> {

    public TrabajaEnService(TrabajaEnRepository baseRepository) {
        super(baseRepository);
    }

}
