package com.web.api.appreforma.repositorios;

import com.web.api.appreforma.entidades.TrabajaEn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajaEnRepository extends JpaRepository<TrabajaEn, Integer> {

}
