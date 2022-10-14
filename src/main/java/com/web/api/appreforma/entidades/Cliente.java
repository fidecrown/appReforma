package com.web.api.appreforma.entidades;

import com.web.api.appreforma.entidades.catalogos.Baja;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "clienteid")
    private Integer clienteid;

    @Column(name = "numero_cliente")
    private String numero_cliente;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechaingreso")
    private Date fechaingreso;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechabaja")
    private Date fechabaja;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechareingreso")
    private Date fechareingreso;

    @Column(name = "estatus")
    private String estatus;

    @OneToOne
    @JoinColumn(name = "solicitudid")
    private SolicitudIngreso solicitudIngreso;

    @OneToOne
    @JoinColumn(name = "bajas_id")
    private Baja baja;
}
