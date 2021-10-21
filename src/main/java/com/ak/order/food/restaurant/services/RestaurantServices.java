package com.ak.order.food.restaurant.services;

import com.ak.order.food.restaurant.entities.Restaurant;

import java.util.List;

public interface RestaurantServices {

    Restaurant createRestaurant(Restaurant restaurantName);

    List<Restaurant> getRestaurantName(String restaurantName, Restaurant restaurant);

    List<Restaurant> getRestaurantBudget(String searchQuery, Restaurant restaurant);

    List<Restaurant> getRestaurantLocation(String searchQuery, Restaurant restaurant);
}
