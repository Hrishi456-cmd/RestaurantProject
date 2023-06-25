package com.geekster.Restaurant.repository;

import com.geekster.Restaurant.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RestaurantRepo {
@Autowired
    private List<Restaurant> restaurantList;

    public List<Restaurant> getRestaurants() {
        return restaurantList;
    }

    public Restaurant getMyRestaurantId(Integer restaurantId) {
        for(Restaurant restaurant: restaurantList){
            if(restaurant.getRestaurantId() == restaurantId){
                return restaurant;
            }
        }
        return null;
    }

}
