package com.restaurant.nearByRest.Entity;

import javax.persistence.*;

@Entity
@Table(name="order")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="food_name")
    private String foodName;

    @Column(name="price")
    private String price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public OrderEntity(String foodName, String price) {
        this.foodName = foodName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public OrderEntity(){

    }

}
