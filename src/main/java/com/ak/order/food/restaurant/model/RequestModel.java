package com.ak.order.food.restaurant.model;

import com.ak.order.food.restaurant.entities.Restaurant;
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
