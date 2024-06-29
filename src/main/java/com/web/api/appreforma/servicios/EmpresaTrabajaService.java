package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.EmpresaTrabaja;
import com.web.api.appreforma.repositorios.EmpresaTrabajaRepository;
import org.springframework.stereotype.Service;

@Service
public class EmpresaTrabajaService extends BaseServiceImpl<EmpresaTrabaja, EmpresaTrabajaRepository> {

    public EmpresaTrabajaService(EmpresaTrabajaRepository baseRepository) {
        super(baseRepository);
    }

}
