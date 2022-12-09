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
public class restAPIcontroller {



    private RestServiceImp restServiceImp;

    @Autowired
    public restAPIcontroller (RestServiceImp restServiceImp) {
        this.restServiceImp = restServiceImp;

    }

    // find all get mapping
    @GetMapping("/restaurant")
    public List<RestaurantEntity> findAll() {
        return  restServiceImp.findAll();

    }

     // find by id with get mapping only

        // restaurant find by id
    @GetMapping("/restaurant/{restId}")
    public Optional<RestaurantEntity> findAll(@PathVariable int restId) {
        Optional<RestaurantEntity> theRest = restServiceImp.findById(restId);
        if(theRest == null) {
            throw new RuntimeException("RestaurantEntity Id not found -"+ restId);
        }

        return theRest;
    }





    @PostMapping("/restaurant")
    public RestaurantEntity save(@RequestBody RestaurantEntity theRest) {

        theRest.setId(0);
        restServiceImp.save(theRest);

        return theRest;
    }





    @PutMapping("/restaurant")
    public RestaurantEntity update(@RequestBody RestaurantEntity theEmp) {

        restServiceImp.save(theEmp);

        return theEmp;
    }

    @DeleteMapping("/restaurant/{theId}")
    public String delete(@PathVariable int theId) {

        restServiceImp.delete(theId);

        return  theId + "is deleted";
    }




}
