package com.web.api.appreforma.repositorios.catalogos;

import com.web.api.appreforma.entidades.catalogos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
