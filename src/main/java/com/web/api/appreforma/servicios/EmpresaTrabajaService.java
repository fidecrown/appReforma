package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.EmpresaTrabaja;
import com.web.api.appreforma.repositorios.EmpresaTrabajaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class EmpresaTrabajaService extends BaseServiceImpl<EmpresaTrabaja, EmpresaTrabajaRepository> {
    public EmpresaTrabajaService(EmpresaTrabajaRepository baseRepository) {
        super(baseRepository);
    }
}
