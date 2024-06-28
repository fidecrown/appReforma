package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Ente;
import com.web.api.appreforma.repositorios.EnteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EnteService extends BaseServiceImpl<Ente, EnteRepository> {
    public EnteService(EnteRepository baseRepository) {
        super(baseRepository);
    }
}
