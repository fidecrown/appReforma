package com.web.api.appreforma.entidades;

import com.web.api.appreforma.entidades.catalogos.ClienteCatalogo;
import com.web.api.appreforma.entidades.catalogos.Nacionalidad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "solicitud_ingreso")
public class SolicitudIngreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "solicitudid")
    private Integer solicitudid;

    @Column(name = "numero_solicitud")
    private Integer numero_solicitud;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechasolicitud")
    private Date fechasolicitud;

    @OneToOne
    @JoinColumn(name = "nacionalidadid")
    private Nacionalidad nacionalidad;

    @Column(name = "correoelectronico")
    private String correoelectronico;

    @Column(name = "periorisidadmovimientos")
    private String periorisidadmovimientos;

    @Column(name = "finalidad_cuenta")
    private Integer finalidad_cuenta;

    @Column(name = "medioentero")
    private Integer medioentero;

    @Column(name = "comprobaciondeingresos")
    private Integer comprobaciondeingresos;

    @Column(name = "montoaproximadoahorro")
    private Double montoaproximadoahorro;

    @Column(name = "tienecuentas")
    private Integer tienecuentas;

    @OneToOne
    @JoinColumn(name = "catalogoclienteid")
    private ClienteCatalogo clienteCatalogo;

    @Column(name = "dondetienecuentas")
    private String dondetienecuentas;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_ultima_actualizacion")
    private Date fecha_ultima_actualizacion;

    @Column(name = "lastserie",length = 2)
    private String lastserie;

    @Column(name = "montoaproximadoretiro")
    private Double montoaproximadoretiro;

}
