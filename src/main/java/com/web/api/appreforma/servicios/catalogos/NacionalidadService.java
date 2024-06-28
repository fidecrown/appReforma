package com.web.api.appreforma.servicios.catalogos;

import com.web.api.appreforma.entidades.catalogos.Nacionalidad;
import com.web.api.appreforma.repositorios.catalogos.NacionalidadRepository;
import com.web.api.appreforma.servicios.BaseService;
import com.web.api.appreforma.servicios.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class NacionalidadService extends BaseServiceImpl<Nacionalidad, NacionalidadRepository> {
    public NacionalidadService(NacionalidadRepository baseRepository) {
        super(baseRepository);
    }
}
