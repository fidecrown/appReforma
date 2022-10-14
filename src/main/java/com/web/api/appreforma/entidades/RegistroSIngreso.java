package com.web.api.appreforma.entidades;

import com.web.api.appreforma.entidades.catalogos.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroSIngreso {

    private Ente ente;

    private Sujeto sujeto;

    private Cliente cliente;

}
