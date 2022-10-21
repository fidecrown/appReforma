package com.web.api.appreforma.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SolicitudLaboral {

    private Ente ente;

    private EmpresaTrabaja empresaTrabaja;

    private TrabajaEn trabajaEn;

    private Domicilio domicilio;

}
