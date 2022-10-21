package com.web.api.appreforma.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolicitudRelaciones {

    private Ente ente;

    private Sujeto sujeto;

    private RelacionesCliente relacionesCliente;

    private Domicilio domicilio;

    private Relacion relacion;

}
