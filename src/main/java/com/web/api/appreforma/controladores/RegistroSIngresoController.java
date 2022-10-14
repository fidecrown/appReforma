package com.web.api.appreforma.controladores;

import com.web.api.appreforma.entidades.RegistroSIngreso;
import com.web.api.appreforma.servicios.RegistroSIngresoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "reforma/api/v1/registroSolicitud")
public class RegistroSIngresoController {

    @Autowired
    private RegistroSIngresoService registroSIngresoService;

    @PostMapping("")
    public ResponseEntity<?> saveRegistroIngreso(@RequestBody RegistroSIngreso entidad){
        try {
            registroSIngresoService.save(entidad);
            return ResponseEntity.status(HttpStatus.OK).body("{\"msj\" : \"Solicitud de Ingreso Guardada Correctamente.\"}");
        }catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\" : \"Error por favor intente mas tarde.\"}");
        }
    }

}
