package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Cliente;
import com.web.api.appreforma.repositorios.BaseRepository;
import com.web.api.appreforma.repositorios.ClienteRepository;
import com.web.api.appreforma.servicios.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

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
