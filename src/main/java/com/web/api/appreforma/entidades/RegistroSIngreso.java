package com.web.api.appreforma.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroSIngreso {

    private SolicitudIngreso solicitudIngreso;

    private PerfilCliente perfilCliente;

    private Ente ente;

    private Sujeto sujeto;

    private Cliente cliente;


}
