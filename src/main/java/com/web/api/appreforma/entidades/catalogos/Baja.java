package com.web.api.appreforma.entidades.catalogos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

}
