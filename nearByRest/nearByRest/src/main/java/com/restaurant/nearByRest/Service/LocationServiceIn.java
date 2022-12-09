package com.restaurant.nearByRest.Service;

import com.restaurant.nearByRest.Entity.LocationEntity;



import java.util.List;
import java.util.Optional;


public interface LocationServiceIn {



    public List<LocationEntity> findAll();
    public Optional<LocationEntity> findById(int theId);

    public void save(LocationEntity theLoc);

    public void delete(int theId);





}
