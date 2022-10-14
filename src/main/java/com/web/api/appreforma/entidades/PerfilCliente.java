package com.web.api.appreforma.entidades;

import com.web.api.appreforma.entidades.catalogos.Ciudad;
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
@Table(name = "perfil_cliente")
public class PerfilCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "perfilid")
    private Integer perfilid;

    @Column(name = "nivelesestudios")
    private Integer nivelesestudios;

    @Column(name = "regimen")
    private Integer regimen;

    @Column(name = "estadocivil")
    private Integer estadocivil;

    @Column(name = "telefonocelular")
    private String telefonocelular;

    @Column(name = "tipovivienda")
    private Integer tipovivienda;

    @Column(name = "tiempoarraigo")
    private String tiempoarraigo;

    @Column(name = "perioricidadingresos")
    private Integer perioricidadingresos;

    @Column(name = "ingresos")
    private Double ingresos;

    @Column(name = "otrosingresos")
    private Double otrosingresos;

    @Column(name = "gastos")
    private Double gastos;

    @Column(name = "medioentero")
    private Integer medioentero;

    @Column(name = "finalidadcuenta")
    private Integer finalidadcuenta;

    @Column(name = "nodependienteseconomicos")
    private Integer nodependienteseconomicos;

    @Column(name = "ingresosconyuge")
    private Double ingresosconyuge;

    @Column(name = "otrosgastos")
    private Double otrosgastos;

    @Column(name = "otrosabonos")
    private Double otrosabonos;

    @Column(name = "nomovimientos")
    private Integer nomovimientos;

    @Column(name = "nomivimientosreales")
    private Integer nomivimientosreales;

    @Column(name = "ingresosreales")
    private Double ingresosreales;

    @Column(name = "egresosreales")
    private Double egresosreales;

    @Temporal(TemporalType.DATE)
    @Column(name = "actualizacion")
    private Date actualizacion;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "solicitudid")
    private SolicitudIngreso solicitudIngreso;

    @OneToOne
    @JoinColumn(name = "ciudadid")
    private Ciudad ciudad;

    @OneToOne
    @JoinColumn(name = "ocupacionid")
    private Ocupacion ocupacion;


}
