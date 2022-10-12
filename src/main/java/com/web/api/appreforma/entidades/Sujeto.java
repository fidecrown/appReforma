package com.web.api.appreforma.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sujetos")
public class Sujeto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sujetos_sujetoid_seq")
    @SequenceGenerator(
            name = "sujetos_sujetoid_seq",
            allocationSize = 1
    )
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

    //@Temporal(TemporalType.DATE)
    @Column(name = "fechaNacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "sexo")
    private int sexo;
}
