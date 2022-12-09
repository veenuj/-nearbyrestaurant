package com.restaurant.nearByRest.Service;

import com.restaurant.nearByRest.Entity.OrderEntity;
import com.restaurant.nearByRest.Entity.RestaurantEntity;
import com.restaurant.nearByRest.Entity.UserEntity;
import com.restaurant.nearByRest.Repositry.RestRepositry;
import com.restaurant.nearByRest.Repositry.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserServiceIn{


    private UserRepositry userRepositry;
    @Autowired
    public UserServiceImp(UserRepositry userRepositry) {
        this.userRepositry = userRepositry;
    }

    @Override
    @Transactional
    public List<UserEntity> findAll() {
        return userRepositry.findAll();
    }

    @Override
    @Transactional
    public Optional<UserEntity> findById(int theId) {
        return userRepositry.findById(theId);
    }

    @Override
    @Transactional
    public void save(UserEntity theUser) {
        userRepositry.save(theUser);
    }

    @Override
    @Transactional
    public void delete(int theId) {
        userRepositry.deleteById(theId);
    }
}
