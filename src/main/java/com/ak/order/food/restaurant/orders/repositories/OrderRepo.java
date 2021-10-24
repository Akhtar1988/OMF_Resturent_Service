package com.ak.order.food.restaurant.orders.repositories;

import com.ak.order.food.restaurant.orders.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order , Long> {
}
