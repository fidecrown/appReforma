package com.web.api.appreforma.entidades.catalogos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "catalogo_colonias")
public class Colonia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coloniaid")
    private Integer coloniaid;

    @Column(name = "nombrecolonia", columnDefinition = "TEXT")
    private String nombrecolonia;

    @Column(name = "codigopostal", columnDefinition = "TEXT")
    private String codigopostal;

    @OneToOne
    @JoinColumn(name = "ciudadid")
    private Ciudad ciudad;

}
