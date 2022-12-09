package com.restaurant.nearByRest.Service;

import com.restaurant.nearByRest.Entity.OrderEntity;
import com.restaurant.nearByRest.Entity.RestaurantEntity;
import com.restaurant.nearByRest.Repositry.OrderRepositry;
import com.restaurant.nearByRest.Repositry.RestRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceimpl implements OrderServiceIn{


    private OrderRepositry orderRepositry;
    @Autowired
    public OrderServiceimpl(OrderRepositry orderRepositry) {
        this.orderRepositry = orderRepositry;
    }

    @Override
    @Transactional
    public List<OrderEntity> findAll() {
        return orderRepositry.findAll();
    }

    @Override
    @Transactional
    public Optional<OrderEntity> findById(int theId) {
        return orderRepositry.findById(theId);
    }

    @Override
    @Transactional
    public void save(OrderEntity theOrder) {
        orderRepositry.save(theOrder);
    }

    @Override
    @Transactional
    public void delete(int theId) {
        orderRepositry.deleteById(theId);
    }
}
