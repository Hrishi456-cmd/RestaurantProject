package com.geekster.Restaurant.controller;

import com.geekster.Restaurant.model.Restaurant;
import com.geekster.Restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("restaurants")
    List<Restaurant> getAllRestaurants()
    {
        return restaurantService.getAllRestaurants();
    }
//    @PostMapping("restaurant")
//    String addRestaurant(@RequestBody Restaurant restaurant)
//    {return restaurantService.createRestaurant(restaurant);}

    @GetMapping("restaurants/{restaurantId}")
    Restaurant findRestaurantById(@PathVariable Integer restaurantId)
    {return restaurantService.getRestaurantById(restaurantId);}

    @PostMapping("restaurant")
    String addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.createRestaurant(restaurant);
    }

    @PutMapping("restaurant/{restaurantId}/{speciality}")
    public String markRestaurant(@PathVariable Integer restaurantId,@PathVariable String speciality)
    {
        return restaurantService.updateRestaurant(restaurantId,speciality);
    }

//    @DeleteMapping("restaurant")
//    public String removeRestaurant(@RequestParam Integer restaurantId)
//    {
//        return restaurantService.removeRestaurant(restaurantId);
//    }

}
