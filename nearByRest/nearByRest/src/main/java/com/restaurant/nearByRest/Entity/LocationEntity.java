package com.restaurant.nearByRest.Entity;

import javax.persistence.*;

@Entity
@Table(name="location")
public class LocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="location")
    private String loc;

    @Column(name="state")
    private String state;

    public LocationEntity(String loc, String state) {
        this.loc = loc;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocationEntity(){

    }

    @Override
    public String toString() {
        return "LocationEntity{" +
                "id=" + id +
                ", loc='" + loc + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
