package com.web.api.appreforma.entidades;

import com.web.api.appreforma.entidades.catalogos.Ciudad;
import com.web.api.appreforma.entidades.catalogos.Nacionalidad;
import com.web.api.appreforma.entidades.catalogos.Ocupacion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "relaciones_cliente")
public class Relacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "relacionid")
    private Integer relacionid;

    //# POSIBLE CONVERTIRLO EN UN CATALOGO DE PARENTESCOS
    //# ESPOSA-PAPA-HIJO-TIA-PRIMA ... ETC
    @Column(name = "parentesco", columnDefinition = "TEXT")
    private String parentesco;

    @Column(name = "porcentaje")
    private Double porcentaje;

    //# POSIBLE CONVERTIRLO EN UN CATALOGO DE RELACIONES
    //# BENEFICIARIO,CONYUGE,REPRESENTANTE, COOTILURA,PERSONAJURIDICA... ETC
    @Column(name = "tipo_relacion")
    private Integer tipoRelacion;

    //# POSIBLE CONVERTIRLO EN UN CATALOGO DE ESTADOS CIVILES
    //# CASADO-JUNTO-UNION LIBRE-DIVORCIADO... ETC
    @Column(name = "estadocivil")
    private Integer estadocivil;

    //AGREGAR UN ENUM (0 - MUJER, 1 - HOMBRE)
    @Column(name = "sexo")
    private Integer sexo;

    @Column(name = "email", columnDefinition = "TEXT")
    private String email;

    @Column(name = "telefonocelular", columnDefinition = "TEXT")
    private String telefonocelular;

    @Column(name = "regimen")
    private Integer regimen;

    @Column(name = "nombreconyuge", columnDefinition = "TEXT")
    private String nombreconyuge;

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
    @JoinColumn(name = "sujetoid")
    private Sujeto sujeto;

    @OneToOne
    @JoinColumn(name = "clienteid")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "ciudadid")
    private Ciudad ciudad;

    @OneToOne
    @JoinColumn(name = "nacionalidadid")
    private Nacionalidad nacionalidad;

    @OneToOne
    @JoinColumn(name = "ocupacionid")
    private Ocupacion ocupacion;

    @PrePersist
    public void fcrecacion(){
        this.createdAt = new Date();
    }
    @PreUpdate
    public void factualizacion(){
        this.updateAt = new Date();
    }
}
