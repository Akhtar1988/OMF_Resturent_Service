package com.ak.order.food.restaurant.orders.model;

import com.ak.order.food.restaurant.orders.entities.Order;
import com.ak.order.food.restaurant.orders.entities.Payment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderResponse {
    Order order;
   /* private Integer orderId;
    private String transactionId;
    private String status;
    private Double totalAmt;*/
    private Payment payment;
}
