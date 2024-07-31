package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Cliente;
import com.web.api.appreforma.repositorios.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteService extends BaseServiceImpl<Cliente, ClienteRepository>{

    public ClienteService(ClienteRepository baseRepository) {
        super(baseRepository);
    }

    @Transactional
    public String getNumero_Cliente() throws Exception {
        try {
            return baseRepository.getNumero_Cliente();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
