package com.ak.order.food.restaurant.restaurants.repositories;

import com.ak.order.food.restaurant.restaurants.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant , Long> {
}
