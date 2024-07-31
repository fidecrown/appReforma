package com.web.api.appreforma.entidades;

import com.web.api.appreforma.entidades.catalogos.Baja;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
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

    @Column(name = "numero_cliente", columnDefinition = "TEXT")
    private String numeroCliente;

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
    private Integer estatus;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_at")
    private Date createdAt;

    @Temporal(TemporalType.DATE)
    @Column(name = "update_at")
    private Date updateAt;

    @OneToOne
    @JoinColumn(name = "solicitudid")
    private SolicitudIngreso solicitudIngreso;

    @OneToOne
    @JoinColumn(name = "bajaid")
    private Baja baja;

    @PrePersist
    public void fcrecacion(){
        this.createdAt = new Date();
    }
    @PreUpdate
    public void factualizacion(){
        this.updateAt = new Date();
    }
}
