package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Cliente;
import com.web.api.appreforma.entidades.Relacion;
import com.web.api.appreforma.repositorios.ClienteRepository;
import com.web.api.appreforma.repositorios.RelacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class RelacionService extends BaseServiceImpl<Relacion, RelacionRepository> {
    public RelacionService(RelacionRepository baseRepository) {
        super(baseRepository);
    }
}
