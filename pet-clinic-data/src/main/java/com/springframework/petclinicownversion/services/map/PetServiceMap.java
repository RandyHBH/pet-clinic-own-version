package com.springframework.petclinicownversion.services.map;

import com.springframework.petclinicownversion.model.Pet;
import com.springframework.petclinicownversion.services.BaseService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements BaseService<Pet>
{
    @Override public Pet save(Pet entity)
    {
        return super.save(entity.getId(), entity);
    }


    @Override public void delete(Long id)
    {
        super.deleteById(id);
    }


    @Override public Pet find(Long id)
    {
        return super.find(id);
    }


    @Override public Set<Pet> findAll()
    {
        return super.findAll();
    }
}
