package com.web.api.appreforma.repositorios;

import com.web.api.appreforma.entidades.EmpresaTrabaja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaTrabajaRepository extends JpaRepository<EmpresaTrabaja, Integer> {

}
