package com.restaurant.nearByRest.Repositry;


import com.restaurant.nearByRest.Entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepositry extends JpaRepository<OrderEntity, Integer> {
}
