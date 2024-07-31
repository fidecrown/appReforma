package com.web.api.appreforma.entidades.catalogos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "catalogo_clientes")
public class ClienteCatalogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catalogoclienteid")
    private Integer catalogoclienteid;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

}
