package org.example.repository;

import java.util.UUID;

public interface CRUDRepository<T> {
    T findById(UUID id);

    void save(T entity);

    void update(T entity);

    void delete(T entity);

}
