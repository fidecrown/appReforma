package com.web.api.appreforma.servicios;

import com.web.api.appreforma.entidades.Ente;
import com.web.api.appreforma.entidades.RegistroSIngreso;
import com.web.api.appreforma.entidades.Sujeto;
import com.web.api.appreforma.servicios.catalogos.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RegistroSIngresoService {

    @Autowired
    private EnteService enteService;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private SujetoService sujeService;

    @Transactional
    public void save(RegistroSIngreso entidad){
        try {
            Ente ente = enteService.save(entidad.getEnte());

            clienteService.save(entidad.getCliente());

            Sujeto sujeto = entidad.getSujeto();
            sujeto.setEnte(ente);
            sujeService.save(sujeto);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
