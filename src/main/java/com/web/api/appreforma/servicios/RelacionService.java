package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Relacion;
import com.web.api.appreforma.repositorios.RelacionRepository;
import org.springframework.stereotype.Service;

@Service
public class RelacionService extends BaseServiceImpl<Relacion, RelacionRepository> {

    public RelacionService(RelacionRepository baseRepository) {
        super(baseRepository);
    }

}
