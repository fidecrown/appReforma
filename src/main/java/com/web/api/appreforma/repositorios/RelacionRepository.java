package com.web.api.appreforma.repositorios;

import com.web.api.appreforma.entidades.Relacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelacionRepository extends JpaRepository<Relacion, Integer> {

}
