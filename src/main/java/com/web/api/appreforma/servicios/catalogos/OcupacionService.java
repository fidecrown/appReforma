package com.web.api.appreforma.servicios.catalogos;

import com.web.api.appreforma.entidades.catalogos.Ciudad;
import com.web.api.appreforma.entidades.catalogos.Ocupacion;
import com.web.api.appreforma.repositorios.catalogos.OcupacionRepository;
import com.web.api.appreforma.servicios.BaseService;
import com.web.api.appreforma.servicios.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class OcupacionService extends BaseServiceImpl<Ocupacion, OcupacionRepository> {
    public OcupacionService(OcupacionRepository baseRepository) {
        super(baseRepository);
    }
}
