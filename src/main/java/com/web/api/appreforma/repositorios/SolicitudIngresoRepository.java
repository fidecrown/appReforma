package com.web.api.appreforma.repositorios;

import com.web.api.appreforma.entidades.SolicitudIngreso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudIngresoRepository extends JpaRepository<SolicitudIngreso, Integer> {
}
