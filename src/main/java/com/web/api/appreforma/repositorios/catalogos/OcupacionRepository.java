package com.web.api.appreforma.repositorios.catalogos;

import com.web.api.appreforma.entidades.catalogos.Ocupacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcupacionRepository extends JpaRepository<Ocupacion, Integer> {
}
