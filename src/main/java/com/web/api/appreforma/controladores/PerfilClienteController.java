package com.web.api.appreforma.controladores;

import com.web.api.appreforma.entidades.PerfilCliente;
import com.web.api.appreforma.servicios.PerfilClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "reforma/api/v1/perfil_cliente")
public class PerfilClienteController {

    @Autowired
    private PerfilClienteService service;

    @GetMapping("")
    public ResponseEntity<?> getAll(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\" : \"Error por favor intente mas tarde.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Integer id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\" : \"Error por favor intente mas tarde.\"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> guardarEntidad(@RequestBody PerfilCliente entidad){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.save(entidad));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Integer id,@RequestBody PerfilCliente entidad){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.update(id,entidad));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\" : \"Error por favor intente mas tarde.\"}");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarById(@PathVariable Integer id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\" : \"Error por favor intente mas tarde.\"}");
        }
    }
}
