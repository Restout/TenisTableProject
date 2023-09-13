package org.example.repository;

public interface CRUDRepository<T> {
    T findById(int id);

    void save(T entity);

    void update(T entity);

    void delete(T entity);

}
