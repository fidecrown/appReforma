package com.web.api.appreforma.repositorios;

import com.web.api.appreforma.entidades.Sujeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface SujetoRepository extends JpaRepository<Sujeto, Integer> {
}
