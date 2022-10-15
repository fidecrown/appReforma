package com.web.api.appreforma.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "entidad")
public class Entidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entidadid")
    private Integer entidadid;

    @Column(name = "razonsocial")
    private String razonsocial;

    @Column(name = "rfc")
    private String rfc;

    @Column(name = "prefijocliente")
    private String prefijocliente;

    @Column(name = "gerente")
    private String gerente;

    @Column(name = "contador")
    private String contador;

    @Column(name = "presidenteadmon")
    private String presidenteadmon;

    @Column(name = "niveloperaciones")
    private String niveloperaciones;

    @Column(name = "nombresucursal")
    private String nombresucursal;

    @Column(name = "montopartesocial")
    private Double montopartesocial;

    @Column(name = "telefono1")
    private String telefono1;

    @Column(name = "telefono2")
    private String telefono2;

    @Column(name = "correoempresa")
    private String correoempresa;

    @Column(name = "gerentegeneral")
    private String gerentegeneral;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_actualizacion")
    private Date fecha_actualizacion;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "enteid")
    private Ente ente;
}
