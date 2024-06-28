package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.ClienteSujeto;
import com.web.api.appreforma.repositorios.BaseRepository;
import com.web.api.appreforma.repositorios.ClienteSujetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteSujetoService extends BaseServiceImpl<ClienteSujeto, ClienteSujetoRepository> {

    public ClienteSujetoService(ClienteSujetoRepository baseRepository) {
        super(baseRepository);
    }
}
