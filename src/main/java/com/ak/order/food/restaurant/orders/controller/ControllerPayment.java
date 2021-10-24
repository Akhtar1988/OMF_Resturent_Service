package com.ak.order.food.restaurant.orders.controller;

import com.ak.order.food.restaurant.orders.entities.Payment;
import com.ak.order.food.restaurant.orders.services.OrderService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@AllArgsConstructor
@RestController
@RequestMapping("/api/payment")
public class ControllerPayment {

     private OrderService orderService;

   @PostMapping("/makePayment")
    public Payment makePayment(@RequestBody Payment payment){
       return orderService.makePayment(payment);
    }

    @PostMapping("/refundPayment")
    public Payment refundAmount(@RequestBody Payment payment) {
        return orderService.refundAmount(payment);
    }
}
