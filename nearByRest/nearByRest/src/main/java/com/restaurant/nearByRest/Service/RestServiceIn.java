package com.restaurant.nearByRest.Service;

import com.restaurant.nearByRest.Entity.RestaurantEntity;


import java.util.List;
import java.util.Optional;

public interface RestServiceIn {

    public List<RestaurantEntity> findAll();
    public Optional<RestaurantEntity> findById(int theId);

    public void save(RestaurantEntity theRest);

    public void delete(int theId);

}
