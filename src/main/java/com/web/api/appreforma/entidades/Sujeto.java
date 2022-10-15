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
@Table(name = "sujetos")
public class Sujeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "sujetoid")
    private Integer sujetoid;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "paterno")
    private String paterno;

    @Column(name = "materno")
    private String materno;

    @Column(name = "rfc")
    private String rfc;

    @Column(name = "curp")
    private String curp;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechaNacimiento")
    private Date fechaNacimiento;

    @Column(name = "sexo")
    private int sexo;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_at")
    private Date created_at;

    @Temporal(TemporalType.DATE)
    @Column(name = "update_at")
    private Date update_at;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "enteid")
    private Ente ente;
    @PrePersist
    public void fcrecacion(){
        this.created_at = new Date();
    }
    @PreUpdate
    public void factualizacion(){
        this.update_at = new Date();
    }
}
