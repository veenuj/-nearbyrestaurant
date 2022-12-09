package com.restaurant.nearByRest.Entity;

import javax.persistence.*;

@Entity
@Table(name="restaurant")
public class RestaurantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String restName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    private LocationEntity locationEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    private OrderEntity orderEntity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    private UserEntity userEntity;

    @Override
    public String toString() {
        return "RestaurantEntity{" +
                "id=" + id +
                ", restName='" + restName + '\'' +
                ", locationEntity=" + locationEntity +
                ", orderEntity=" + orderEntity +
                ", userEntity=" + userEntity +
                '}';
    }

    public RestaurantEntity(String restName) {
        this.restName = restName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public LocationEntity getLocationEntity() {
        return locationEntity;
    }

    public void setLocationEntity(LocationEntity locationEntity) {
        this.locationEntity = locationEntity;
    }

    public OrderEntity getOrderEntity() {
        return orderEntity;
    }

    public void setOrderEntity(OrderEntity orderEntity) {
        this.orderEntity = orderEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public RestaurantEntity(){

    }





}
