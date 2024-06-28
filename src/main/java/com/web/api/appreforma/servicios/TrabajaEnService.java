package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.TrabajaEn;
import com.web.api.appreforma.repositorios.TrabajaEnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class TrabajaEnService extends BaseServiceImpl<TrabajaEn, TrabajaEnRepository> {
    public TrabajaEnService(TrabajaEnRepository baseRepository) {
        super(baseRepository);
    }
}
