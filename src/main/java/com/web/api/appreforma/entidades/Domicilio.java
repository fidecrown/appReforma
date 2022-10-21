package com.web.api.appreforma.entidades;

import com.web.api.appreforma.entidades.catalogos.ClienteCatalogo;
import com.web.api.appreforma.entidades.catalogos.Colonia;
import com.web.api.appreforma.entidades.catalogos.Nacionalidad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

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
    private Integer numero_exterior;

    @Column(name = "numero_interior")
    private Integer numero_interior;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "entrecalle_1")
    private String entrecalle_1;

    @Column(name = "entrecalle_2")
    private String entrecalle_2;

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
