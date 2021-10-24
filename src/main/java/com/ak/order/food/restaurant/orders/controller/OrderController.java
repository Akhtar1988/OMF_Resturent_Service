package com.ak.order.food.restaurant.orders.controller;

import com.ak.order.food.restaurant.orders.entities.Order;
import com.ak.order.food.restaurant.orders.model.OrderRequest;
import com.ak.order.food.restaurant.orders.model.OrderResponse;
import com.ak.order.food.restaurant.orders.services.OrderService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RequestMapping("api/order")
@RestController
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/create_order")
    public OrderResponse createOrder(@RequestBody Order orderRequest) {
           return orderService.createOrder(orderRequest);

    }

    @GetMapping("/viewAllOrderDetails")
    public List<Order> getViewOrderDetails(){
        return orderService.getAllOrder();

    }
    @GetMapping("/getViewById/{id}")
     public Optional<Order> getOrderById(@PathVariable("id") Long id){
        return orderService.getViewById(id);
     }

     @DeleteMapping(name = "/deleteOrder/{order_id}")
     public List<Order> deleteOrder(@PathVariable("order_id") Long id){
        return orderService.deleteOrder(id);
     }
}
