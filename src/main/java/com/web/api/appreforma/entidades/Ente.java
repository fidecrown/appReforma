package com.web.api.appreforma.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ente")
public class Ente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "enteid")
    private Integer enteid;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

}
