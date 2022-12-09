package com.restaurant.nearByRest.Service;

import com.restaurant.nearByRest.Entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserServiceIn {



    public List<UserEntity> findAll();
    public Optional<UserEntity> findById(int theId);

    public void save(UserEntity theUse);

    public void delete(int theId);





}
