package com.geekster.Restaurant.configuration;

import com.geekster.Restaurant.model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    @Bean
    public List<Restaurant> getInitializedList()
    {
        Restaurant initRestaurant = new Restaurant(0,"Geminy","Lonawala","9287123466","Indian",200);
        List<Restaurant> initList = new ArrayList<>();
        initList.add(initRestaurant);
        return initList;
    }
}
