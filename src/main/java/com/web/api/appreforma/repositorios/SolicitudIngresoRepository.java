package com.web.api.appreforma.repositorios;

import com.web.api.appreforma.entidades.SolicitudIngreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudIngresoRepository extends JpaRepository<SolicitudIngreso, Integer> {

    @Query(value = "SELECT \n" +
            "\tCOALESCE(MAX(NUMERO_SOLICITUD),0)+1 AS NUMERO_SOLICITUD\n" +
            "FROM SOLICITUD_INGRESO;",
            nativeQuery = true)
    Integer getNumeroSolicitud();
}
