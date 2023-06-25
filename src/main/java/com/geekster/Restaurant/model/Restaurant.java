package com.geekster.Restaurant.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
        private Integer restaurantId;
        private String restaurantName;
        private String restaurantAddress;
        private String contact;
        private String speciality;
        private Integer totalStaff;
}
