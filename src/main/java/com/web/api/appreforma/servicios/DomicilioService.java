package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Cliente;
import com.web.api.appreforma.entidades.Domicilio;
import com.web.api.appreforma.repositorios.ClienteRepository;
import com.web.api.appreforma.repositorios.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class DomicilioService extends BaseServiceImpl<Domicilio, DomicilioRepository> {
    public DomicilioService(DomicilioRepository baseRepository) {
        super(baseRepository);
    }
}
