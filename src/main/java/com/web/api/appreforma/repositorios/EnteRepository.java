package com.web.api.appreforma.repositorios;

import com.web.api.appreforma.entidades.Ente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnteRepository extends JpaRepository<Ente, Integer> {
}
