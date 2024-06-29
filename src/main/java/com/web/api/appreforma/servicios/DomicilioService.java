package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Domicilio;
import com.web.api.appreforma.repositorios.DomicilioRepository;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService extends BaseServiceImpl<Domicilio, DomicilioRepository> {

    public DomicilioService(DomicilioRepository baseRepository) {
        super(baseRepository);
    }

}
