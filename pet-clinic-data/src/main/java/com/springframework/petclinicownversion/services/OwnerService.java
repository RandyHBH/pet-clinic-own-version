package com.springframework.petclinicownversion.services;

import com.springframework.petclinicownversion.model.Owner;

import java.util.Set;

public interface OwnerService
{
    Owner save(Owner owner);

    void delete(Long id);

    Owner find(Long id);

    Set<Owner> findAll();
}
