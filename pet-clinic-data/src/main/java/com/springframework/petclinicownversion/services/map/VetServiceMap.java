package com.springframework.petclinicownversion.services.map;

import com.springframework.petclinicownversion.model.Vet;
import com.springframework.petclinicownversion.services.BaseService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements BaseService<Vet>
{
    @Override public Vet save(Vet entity)
    {
        return super.save(entity.getId(), entity);
    }


    @Override public void delete(Long id)
    {
        super.deleteById(id);
    }


    @Override public Vet find(Long id)
    {
        return super.find(id);
    }


    @Override public Set<Vet> findAll()
    {
        return super.findAll();
    }
}
