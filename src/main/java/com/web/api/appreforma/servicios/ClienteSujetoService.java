package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.ClienteSujeto;
import com.web.api.appreforma.repositorios.ClienteSujetoRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteSujetoService extends BaseServiceImpl<ClienteSujeto, ClienteSujetoRepository> {

    public ClienteSujetoService(ClienteSujetoRepository baseRepository) {
        super(baseRepository);
    }
}
