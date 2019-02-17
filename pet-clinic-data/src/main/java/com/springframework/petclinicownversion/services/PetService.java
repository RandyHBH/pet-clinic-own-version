package com.springframework.petclinicownversion.services;

import com.springframework.petclinicownversion.model.Pet;

import java.util.Set;

public interface PetService
{
    Pet save(Pet pet);

    void delete(Long id);

    Pet find(Long id);

    Set<Pet> findAll();
}
