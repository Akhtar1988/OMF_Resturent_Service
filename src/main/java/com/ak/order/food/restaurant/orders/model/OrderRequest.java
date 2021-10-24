package com.ak.order.food.restaurant.orders.model;

import com.ak.order.food.restaurant.orders.entities.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderRequest {
        Order order_details;
}