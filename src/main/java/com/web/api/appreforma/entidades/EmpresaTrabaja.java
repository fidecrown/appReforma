package com.web.api.appreforma.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "empresa_trabaja")
public class EmpresaTrabaja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "empresaid")
    private Integer empresaid;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "rfc")
    private String rfc;

    @Column(name = "nombrejefedirecto")
    private String nombrejefedirecto;

    @OneToOne
    @JoinColumn(name = "enteid")
    private Ente ente;

}
