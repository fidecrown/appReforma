package com.web.api.appreforma.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.web.api.appreforma.entidades.catalogos.Colonia;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "domicilios")
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "domicilioid")
    private Integer domicilioid;

    @Column(name = "calle", columnDefinition = "TEXT")
    private String calle;

    @Column(name = "numero_exterior")
    private Integer numeroExterior;

    @Column(name = "numero_interior")
    private Integer numeroInterior;

    @Column(name = "telefono", columnDefinition = "TEXT")
    private String telefono;

    @Column(name = "entrecalle_1", columnDefinition = "TEXT")
    private String entreCalle1;

    @Column(name = "entrecalle_2", columnDefinition = "TEXT")
    private String entreCalle2;

    @Column(name = "referencia", columnDefinition = "TEXT")
    private String referencia;

    @Column(name = "numerodomicilio")
    private Integer numerodomicilio;

    /* POSIBLEMENTE TENGA QUE SER UN CATALOGO*/
    @Column(name = "tiempoarraigo", columnDefinition = "TEXT")
    private String tiempoarraigo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enteid")
    @JsonIgnore
    private Ente ente;

    @OneToOne
    @JoinColumn(name = "coloniaid")
    private Colonia colonia;

}
