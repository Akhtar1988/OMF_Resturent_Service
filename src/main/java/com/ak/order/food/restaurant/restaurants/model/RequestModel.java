package com.ak.order.food.restaurant.restaurants.model;

import com.ak.order.food.restaurant.restaurants.entities.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestModel {
    private Restaurant restaurant;
}
