package com.springframework.petclinicownversion.services;

import com.springframework.petclinicownversion.model.Vet;

import java.util.Set;

public interface VetService
{
    Vet save(Vet vet);

    void delete(Long id);

    Vet find(Long id);

    Set<Vet> findAll();
}
