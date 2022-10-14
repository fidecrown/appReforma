package com.web.api.appreforma.entidades.catalogos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "catalogo_ciudades")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ciudadid")
    private Integer ciudadid;

    @Column(name = "nombre")
    private String nombre;

    /*
    @OneToOne
    @JoinColumn(name = "estadoid")
    private Estado estado;
    */

}
