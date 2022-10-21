package com.web.api.appreforma.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RelacionesCliente {

    private Cliente cliente;

    private Ente ente;

    private Sujeto sujeto;

    private Domicilio domicilio;

}
