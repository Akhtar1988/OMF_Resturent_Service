package com.ak.order.food.restaurant.model;

import com.ak.order.food.restaurant.entities.Restaurant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResponseModel {
    List<Restaurant> restaurants_name;
}
