package com.web.api.appreforma.controladores;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public interface BaseController<E, ID> {

    public ResponseEntity<?> getAll();

    public ResponseEntity<?> getOne(@PathVariable ID id);

    public ResponseEntity<?> guardarEntidad(@RequestBody E entidad);

    public ResponseEntity<?> actualizar(@PathVariable ID id,@RequestBody E entidad);

    public ResponseEntity<?> eliminarById(@PathVariable ID id);
}
