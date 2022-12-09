package com.restaurant.nearByRest.Repositry;


import com.restaurant.nearByRest.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositry extends JpaRepository<UserEntity, Integer> {
}
