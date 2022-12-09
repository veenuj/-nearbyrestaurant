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
public class UserAPIcontroller {



    private UserServiceImp userServiceImp;


    @Autowired
    public UserAPIcontroller(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;

    }



    @GetMapping("/user")
    public List<UserEntity> findAll() {
        return userServiceImp.findAll();
    }


    @GetMapping("/user/{userId}")
    public Optional<UserEntity> findAll(@PathVariable int userId) {
        Optional<UserEntity> theUser = userServiceImp.findById(userId);
        if(theUser == null) {
            throw new RuntimeException("UserEntity Id not found -"+ userId);
        }

        return theUser;
    }

    @PostMapping("/user")
    public UserEntity save(@RequestBody UserEntity theLoc) {

        theLoc.setId(0);
        userServiceImp.save(theLoc);

        return theLoc;
    }

    @PutMapping("/user")
    public UserEntity update(@RequestBody UserEntity theEmp) {

        userServiceImp.save(theEmp);

        return theEmp;
    }



    @DeleteMapping("/user/{theId}")
    public String delete(@PathVariable int theId) {

        userServiceImp.delete(theId);

        return  theId + "is deleted";
    }




}
