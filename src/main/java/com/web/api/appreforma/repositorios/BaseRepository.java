package com.web.api.appreforma.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository <E, ID extends Integer> extends JpaRepository<E, ID> {
}
