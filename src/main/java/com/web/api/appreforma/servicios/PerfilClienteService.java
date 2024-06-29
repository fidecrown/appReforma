package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.PerfilCliente;
import com.web.api.appreforma.repositorios.PerfilClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class PerfilClienteService extends BaseServiceImpl<PerfilCliente, PerfilClienteRepository> {

    public PerfilClienteService(PerfilClienteRepository baseRepository) {
        super(baseRepository);
    }

}
