package com.web.api.appreforma.entidades;

import com.web.api.appreforma.entidades.catalogos.Ciudad;
import com.web.api.appreforma.entidades.catalogos.Nacionalidad;
import com.web.api.appreforma.entidades.catalogos.Ocupacion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    @Column(name = "parentesco")
    private String parentesco;

    @Column(name = "porcentaje")
    private Double porcentaje;

    //# POSIBLE CONVERTIRLO EN UN CATALOGO DE RELACIONES
    //# BENEFICIARIO,CONYUGE,REPRESENTANTE, COOTILURA,PERSONAJURIDICA... ETC
    @Column(name = "tipo_relacion")
    private Integer tipo_relacion;

    //# POSIBLE CONVERTIRLO EN UN CATALOGO DE ESTADOS CIVILES
    //# CASADO-JUNTO-UNION LIBRE-DIVORCIADO... ETC
    @Column(name = "estadocivil")
    private Integer estadocivil;

    //AGREGAR UN ENUM (0 - MUJER, 1 - HOMBRE)
    @Column(name = "sexo")
    private Integer sexo;

    @Column(name = "email")
    private String email;

    @Column(name = "telefonocelular")
    private String telefonocelular;

    @Column(name = "regimen")
    private Integer regimen;

    @Column(name = "nombreconyuge")
    private String nombreconyuge;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_at")
    private Date created_at;

    @Temporal(TemporalType.DATE)
    @Column(name = "update_at")
    private Date update_at;

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
        this.created_at = new Date();
    }
    @PreUpdate
    public void factualizacion(){
        this.update_at = new Date();
    }
}
