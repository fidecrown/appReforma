package com.web.api.appreforma.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
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

    @Column(name = "nombre", columnDefinition = "TEXT")
    private String nombre;

    @Column(name = "paterno", columnDefinition = "TEXT")
    private String paterno;

    @Column(name = "materno", columnDefinition = "TEXT")
    private String materno;

    @Column(name = "rfc", columnDefinition = "TEXT")
    private String rfc;

    @Column(name = "curp", columnDefinition = "TEXT")
    private String curp;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechaNacimiento")
    private Date fechaNacimiento;

    @Column(name = "sexo")
    private int sexo;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_at")
    private Date createdAt;

    @Temporal(TemporalType.DATE)
    @Column(name = "update_at")
    private Date updateAt;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "enteid")
    @JsonIgnore
    private Ente ente;

    @PrePersist
    public void fcrecacion(){
        this.createdAt = new Date();
    }

    @PreUpdate
    public void factualizacion(){
        this.updateAt = new Date();
    }
}
