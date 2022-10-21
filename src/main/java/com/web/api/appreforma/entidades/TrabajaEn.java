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
@Table(name = "trabajaen")
public class TrabajaEn {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "trabajaenid")
    private Integer trabajaenid;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechainicio")
    private Date fechainicio;

    @Temporal(TemporalType.DATE)
    @Column(name = "fechatermino")
    private Date fechatermino;

    @OneToOne
    @JoinColumn(name = "solicitudid")
    private SolicitudIngreso solicitudIngreso;

    @OneToOne
    @JoinColumn(name = "empresaid")
    private EmpresaTrabaja empresaTrabaja;

}
