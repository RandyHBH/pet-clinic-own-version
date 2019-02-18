package com.springframework.petclinicownversion.services;

import java.util.Set;

public interface BaseService<T>
{
    T save(T entity);

    void delete(Long id);

    T find(Long id);

    Set<T> findAll();
}
