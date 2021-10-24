package com.ak.order.food.restaurant.orders.services;

import com.ak.order.food.restaurant.orders.entities.Order;
import com.ak.order.food.restaurant.orders.model.OrderResponse;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    OrderResponse createOrder(Order orderRequest);

    List<Order> getAllOrder();

    Optional<Order> getViewById(Long id);

    List<Order> deleteOrder(Long id);
}
