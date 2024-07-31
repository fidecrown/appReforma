package com.web.api.appreforma.servicios.catalogos;

import com.web.api.appreforma.entidades.catalogos.Colonia;
import com.web.api.appreforma.repositorios.catalogos.ColoniaRepository;
import com.web.api.appreforma.servicios.BaseService;
import com.web.api.appreforma.servicios.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ColoniaService extends BaseServiceImpl<Colonia, ColoniaRepository> {
    public ColoniaService(ColoniaRepository baseRepository) {
        super(baseRepository);
    }
}
