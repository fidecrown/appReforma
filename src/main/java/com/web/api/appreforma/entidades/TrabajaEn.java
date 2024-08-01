package com.web.api.appreforma.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "solicitudid")
    @JsonIgnore
    private SolicitudIngreso solicitudIngreso;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresaid")
    @JsonIgnore
    private EmpresaTrabaja empresaTrabaja;

}
