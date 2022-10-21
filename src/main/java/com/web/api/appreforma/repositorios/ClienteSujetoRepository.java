package com.web.api.appreforma.repositorios;

import com.web.api.appreforma.entidades.ClienteSujeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteSujetoRepository extends JpaRepository<ClienteSujeto, Integer> {

}
