package com.web.api.appreforma.entidades.catalogos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "catalogo_bajas")
public class Baja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bajaid")
    private Integer bajaid;

    @Column(name = "descripcion")
    private String descripcion;

}
