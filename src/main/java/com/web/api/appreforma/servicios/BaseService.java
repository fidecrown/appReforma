package com.web.api.appreforma.servicios;

import java.util.List;

public interface BaseService<E> {

    List<E> findAll() throws Exception;
    E findById(Integer id) throws Exception;
    E save(E entidad) throws Exception;
    E update(Integer id, E entidad) throws Exception;
    boolean delete(Integer id) throws Exception;
}
