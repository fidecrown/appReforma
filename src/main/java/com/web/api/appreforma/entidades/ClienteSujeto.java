package com.web.api.appreforma.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente_sujeto")
public class ClienteSujeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clientesujetoid")
    private Integer clientesujetoid;

    @OneToOne
    @JoinColumn(name = "sujetoid")
    private Sujeto sujeto;

    @OneToOne
    @JoinColumn(name = "clienteid")
    private Cliente cliente;

}
