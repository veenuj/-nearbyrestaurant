package com.restaurant.nearByRest.Controller;

import com.restaurant.nearByRest.Entity.LocationEntity;
import com.restaurant.nearByRest.Entity.OrderEntity;
import com.restaurant.nearByRest.Entity.RestaurantEntity;
import com.restaurant.nearByRest.Entity.UserEntity;
import com.restaurant.nearByRest.Service.LocServiceImp;
import com.restaurant.nearByRest.Service.OrderServiceimpl;
import com.restaurant.nearByRest.Service.RestServiceImp;
import com.restaurant.nearByRest.Service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restAPI")
public class LocAPIcontroller {


    private LocServiceImp locServiceImp;


    @Autowired
    public LocAPIcontroller(LocServiceImp locServiceImp) {
        this.locServiceImp = locServiceImp;

    }





    @GetMapping("/location")
    public List<LocationEntity> findAll() {
        return locServiceImp.findAll();
    }

    // location find by id
    @GetMapping("/location/{locId}")
    public Optional<LocationEntity> findAll(@PathVariable int locId) {
        Optional<LocationEntity> theLoc = locServiceImp.findById(locId);
        if(theLoc == null) {
            throw new RuntimeException("LocationEntity Id not found -"+ locId);
        }

        return theLoc;
    }


    @PostMapping("/location")
    public LocationEntity save(@RequestBody LocationEntity theLoc) {

        theLoc.setId(0);
        locServiceImp.save(theLoc);

        return theLoc;
    }

    @PutMapping("/location")
    public LocationEntity update(@RequestBody LocationEntity theLoc) {

        locServiceImp.save(theLoc);

        return theLoc;
    }



    @DeleteMapping("/location/{theId}")
    public String delete(@PathVariable int theId) {

        locServiceImp.delete(theId);

        return  theId + "is deleted";
    }




}
