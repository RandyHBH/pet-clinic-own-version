package com.springframework.petclinicownversion.services.map;

import com.springframework.petclinicownversion.model.Owner;
import com.springframework.petclinicownversion.services.BaseService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements BaseService<Owner>
{
    @Override public Owner save(Owner entity)
    {
        return super.save(entity.getId(), entity);
    }


    @Override public void delete(Long id)
    {
        super.deleteById(id);
    }


    @Override public Owner find(Long id)
    {
        return super.find(id);
    }


    @Override public Set<Owner> findAll()
    {
        return super.findAll();
    }
}
