package com.web.api.appreforma.entidades.catalogos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "catalogo_ocupaciones")
public class Ocupacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ocupacionid")
    private Integer ocupacionid;

    @Column(name = "descripcion")
    private String descripcion;

}
