package com.geekster.Restaurant.service;

import com.geekster.Restaurant.model.Restaurant;
import com.geekster.Restaurant.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurantService {
@Autowired
    RestaurantRepo restaurantRepo;


    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.getRestaurants();
    }

//    public String createRestaurant(Restaurant restaurant) {
//        List<Restaurant> originalList = getAllRestaurants();
//        originalList.add(restaurant);+
//    return "new Restaurant added";
//    }

    public Restaurant getRestaurantById(Integer restaurantId) {
        return restaurantRepo.getMyRestaurantId(restaurantId);
    }

    public String createRestaurant(Restaurant restaurant) {
        List<Restaurant> originalList = getAllRestaurants();
        originalList.add(restaurant);
        return "new restaurant added";
    }

    public String updateRestaurant(Integer restaurantId, String speciality) {
        for(Restaurant myRestaurant : restaurantRepo.getRestaurants())
        {
            if(myRestaurant.getRestaurantId().equals(restaurantId)){
                myRestaurant.setSpeciality(speciality);
                return " speciality updated for" + restaurantId;
            }
        }
        return "restaurant not found with Id" + restaurantId;
    }

//    public String removeRestaurant(Integer restaurantId) {
//        for(Restaurant myRestaurant : restaurantRepo.getRestaurants())
//        {
//            if(myRestaurant.getRestaurantId().equals(restaurantId))
//            {
//                myRestaurant.delete(myRestaurant);
//                return "restaurant removed for ID:" + restaurantId;
//            }
//        }
//        return "Restaurant not exist";
//    }
}
