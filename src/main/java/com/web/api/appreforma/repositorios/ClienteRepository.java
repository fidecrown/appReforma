package com.web.api.appreforma.repositorios;

import com.web.api.appreforma.entidades.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query(
            value = "SELECT * FROM spsmodclientes_numero_cliente();",
            nativeQuery = true)
    String getNumero_Cliente();
}
