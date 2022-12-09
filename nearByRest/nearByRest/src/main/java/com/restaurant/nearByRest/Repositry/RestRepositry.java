package com.restaurant.nearByRest.Repositry;


import com.restaurant.nearByRest.Entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestRepositry extends JpaRepository<RestaurantEntity, Integer>{
}
