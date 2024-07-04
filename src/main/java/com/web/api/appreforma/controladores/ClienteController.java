package com.web.api.appreforma.controladores;

import com.web.api.appreforma.entidades.Cliente;
import com.web.api.appreforma.servicios.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "reforma/api/v1/clientes")
public class ClienteController {

    private static final String MSJ_ERROR = "{\"error\" : \"Error por favor intente mas tarde.\"}";
    private final ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @GetMapping("")
    public ResponseEntity<Object> getAll(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MSJ_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable Integer id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MSJ_ERROR);
        }
    }

    @PostMapping("")
    public ResponseEntity<Object> guardarEntidad(@RequestBody Cliente entidad){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.save(entidad));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MSJ_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> actualizar(@PathVariable Integer id,@RequestBody Cliente entidad){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.update(id,entidad));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MSJ_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> eliminarById(@PathVariable Integer id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(MSJ_ERROR);
        }
    }
}
