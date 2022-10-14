package com.web.api.appreforma.repositorios;

import com.web.api.appreforma.entidades.PerfilCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilClienteRepository extends JpaRepository<PerfilCliente, Integer> {
}
