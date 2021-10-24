package com.ak.order.food.restaurant.orders.controller;

import com.ak.order.food.restaurant.orders.entities.Order;
import com.ak.order.food.restaurant.orders.model.OrderResponse;
import com.ak.order.food.restaurant.orders.services.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping("api/order")
@RestController
public class OrderController {

    private final OrderService orderService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create_order")
    public OrderResponse createOrder(@RequestBody Order order) {
           return orderService.createOrder(order);

    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/viewAllOrderDetails")
    public List<Order> getAllOrder(){
        return orderService.getAllOrder();

    }
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/getViewById/{id}")
     public Order getOrderById(@PathVariable("id") Long id){
        return orderService.getViewById(id);
     }

     @DeleteMapping(name = "/deleteOrder/{order_id}")
     public List<Order> deleteOrder(@PathVariable("order_id") Long id){
        return orderService.deleteOrder(id);
     }
}
