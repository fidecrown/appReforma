package com.web.api.appreforma.controladores;

import com.web.api.appreforma.entidades.RegistroSIngreso;
import com.web.api.appreforma.servicios.RegistroSIngresoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "reforma/api/v1/registroSolicitud")
public class RegistroSIngresoController {

    private final RegistroSIngresoService registroSIngresoService;
    private final HashMap<String, Object> datos = new HashMap<>();

    public RegistroSIngresoController(RegistroSIngresoService registroSIngresoService) {
        this.registroSIngresoService = registroSIngresoService;
    }

    @PostMapping("")
    public ResponseEntity<Object> saveRegistroIngreso(@RequestBody RegistroSIngreso entidad){
        try {
            registroSIngresoService.save(entidad);
            this.datos.put("msj", "Solicitud de Ingreso Guardada Correctamente");
            return ResponseEntity.status(HttpStatus.OK).body(this.datos);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\" : \"Error por favor intente mas tarde.\"}");
        }
    }

}
