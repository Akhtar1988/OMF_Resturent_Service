package com.ak.restaurant.service.restaurants.repositories;

import com.ak.restaurant.service.restaurants.entities.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant , Long> {
}
