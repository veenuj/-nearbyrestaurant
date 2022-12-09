package com.restaurant.nearByRest.Service;

import com.restaurant.nearByRest.Entity.LocationEntity;
import com.restaurant.nearByRest.Repositry.LocReporitry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class LocServiceImp implements LocationServiceIn{


    private LocReporitry locReporitry;
    @Autowired
    public LocServiceImp(LocReporitry locReporitry) {
        this.locReporitry = locReporitry;
    }

    @Override
    @Transactional
    public List<LocationEntity> findAll() {
        return locReporitry.findAll();
    }

    @Override
    @Transactional
    public Optional<LocationEntity> findById(int theId) {
        return locReporitry.findById(theId);
    }

    @Override
    @Transactional
    public void save(LocationEntity theLoc) {
        locReporitry.save(theLoc);
    }

    @Override
    public void delete(int theId) {
        locReporitry.deleteById(theId);
    }
}
