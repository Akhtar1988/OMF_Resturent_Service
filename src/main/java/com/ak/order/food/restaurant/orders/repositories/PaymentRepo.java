package com.ak.order.food.restaurant.orders.repositories;

import com.ak.order.food.restaurant.orders.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long> {
}
