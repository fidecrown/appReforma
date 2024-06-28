package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.PerfilCliente;
import com.web.api.appreforma.repositorios.PerfilClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PerfilClienteService extends BaseServiceImpl<PerfilCliente, PerfilClienteRepository> {
    public PerfilClienteService(PerfilClienteRepository baseRepository) {
        super(baseRepository);
    }
}
