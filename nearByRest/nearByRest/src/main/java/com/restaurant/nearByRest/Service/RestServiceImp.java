package com.restaurant.nearByRest.Service;

import com.restaurant.nearByRest.Entity.LocationEntity;
import com.restaurant.nearByRest.Entity.RestaurantEntity;
import com.restaurant.nearByRest.Repositry.LocReporitry;
import com.restaurant.nearByRest.Repositry.RestRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class RestServiceImp implements RestServiceIn{


    private RestRepositry restRepositry;
    @Autowired
    public RestServiceImp(RestRepositry restRepositry) {
        this.restRepositry = restRepositry;
    }

    @Override
    @Transactional
    public List<RestaurantEntity> findAll() {
        return restRepositry.findAll();
    }

    @Override
    @Transactional
    public Optional<RestaurantEntity> findById(int theId) {
        return restRepositry.findById(theId);
    }

    @Override
    @Transactional
    public void save(RestaurantEntity theLoc) {
        restRepositry.save(theLoc);
    }

    @Override
    @Transactional
    public void delete(int theId) {
        restRepositry.deleteById(theId);
    }
}
