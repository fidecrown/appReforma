package com.web.api.appreforma.entidades;

import com.web.api.appreforma.entidades.catalogos.Colonia;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


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

    @Column(name = "calle")
    private String calle;

    @Column(name = "numero_exterior")
    private Integer numeroExterior;

    @Column(name = "numero_interior")
    private Integer numeroInterior;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "entrecalle_1")
    private String entreCalle1;

    @Column(name = "entrecalle_2")
    private String entreCalle2;

    @Column(name = "referencia")
    private String referencia;

    @Column(name = "numerodomicilio")
    private Integer numerodomicilio;

    /* POSIBLEMENTE TENGA QUE SER UN CATALOGO*/
    @Column(name = "tiempoarraigo")
    private String tiempoarraigo;

    @OneToOne
    @JoinColumn(name = "enteid")
    private Ente ente;

    @OneToOne
    @JoinColumn(name = "coloniaid")
    private Colonia colonia;

}
