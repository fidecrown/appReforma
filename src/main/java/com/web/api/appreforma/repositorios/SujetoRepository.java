package com.web.api.appreforma.repositorios;

import com.web.api.appreforma.entidades.Sujeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

@Repository
public interface SujetoRepository extends JpaRepository<Sujeto, Integer> {
}
