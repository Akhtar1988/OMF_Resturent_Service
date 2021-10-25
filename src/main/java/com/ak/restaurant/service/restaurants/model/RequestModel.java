package com.ak.restaurant.service.restaurants.model;

import com.ak.restaurant.service.restaurants.entities.Restaurant;
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
