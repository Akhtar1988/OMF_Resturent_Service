package com.ak.order.food.restaurant.repositories;

import com.ak.order.food.restaurant.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant , Long> {
}
