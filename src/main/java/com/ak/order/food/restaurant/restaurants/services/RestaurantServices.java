package com.ak.order.food.restaurant.restaurants.services;

import com.ak.order.food.restaurant.restaurants.entities.Restaurant;

import java.util.List;

public interface RestaurantServices {

    Restaurant createRestaurant(Restaurant restaurantName);

    List<Restaurant> getRestaurantName(String restaurantName);

    List<Restaurant> getRestaurantBudget(String searchBudget);

    List<Restaurant> getRestaurantLocation(String searchLocation);

    List<Restaurant> getRestaurent();

    List<Restaurant> getRestaurantCuisine(String cuisine);

    List<Restaurant> getRestaurantDistance(String distance);
}
