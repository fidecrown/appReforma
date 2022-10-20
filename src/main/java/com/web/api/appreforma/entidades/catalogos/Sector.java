package com.web.api.appreforma.entidades.catalogos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "catalogo_sector")
public class Sector {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sectorid")
    private Integer sectorid;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "nivelriesgo")
    private Integer nivelriesgo;

    @Column(name = "sector")
    private String sector;

}
