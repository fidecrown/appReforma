package com.web.api.appreforma.servicios.catalogos;

import com.web.api.appreforma.entidades.catalogos.ClienteCatalogo;
import com.web.api.appreforma.repositorios.catalogos.ClienteCatalogoRepository;
import com.web.api.appreforma.servicios.BaseService;
import com.web.api.appreforma.servicios.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteCatalogoService extends BaseServiceImpl<ClienteCatalogo, ClienteCatalogoRepository> {
    public ClienteCatalogoService(ClienteCatalogoRepository baseRepository) {
        super(baseRepository);
    }
}
