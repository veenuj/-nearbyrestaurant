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
public class OrderAPIcontroller {



    private OrderServiceimpl orderServiceimpl;
    @Autowired
    public OrderAPIcontroller(OrderServiceimpl orderServiceimpl) {
        this.orderServiceimpl = orderServiceimpl;
    }

    @GetMapping("/order")
    public List<OrderEntity> findAll() {
        return orderServiceimpl.findAll();
    }



    @GetMapping("/order/{useId}")
    public Optional<OrderEntity> findAll(@PathVariable int useId) {
        Optional<OrderEntity> theOrder = orderServiceimpl.findById(useId);
        if(theOrder == null) {
            throw new RuntimeException("OrderEntity Id not found -"+ useId);
        }

        return theOrder;
    }



    @PostMapping("/order")
    public OrderEntity save(@RequestBody OrderEntity theOrder) {

        theOrder.setId(0);
        orderServiceimpl.save(theOrder);

        return theOrder;
    }
    @PutMapping("/order")
    public OrderEntity update(@RequestBody OrderEntity theEmp) {

        orderServiceimpl.save(theEmp);

        return theEmp;
    }


    @DeleteMapping("/order/{theId}")
    public String delete(@PathVariable int theId) {

        orderServiceimpl.delete(theId);

        return  theId + "is deleted";
    }




}
