package com.web.api.appreforma.entidades.catalogos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "catalogo_nacionalidades")
public class Nacionalidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nacionalidadid")
    private Integer nacionalidadid;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Column(name = "pais")
    private String pais;
}
