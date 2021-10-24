package com.ak.order.food.restaurant.orders.serviceimp;

import com.ak.order.food.restaurant.orders.constants.AppConstants;
import com.ak.order.food.restaurant.orders.entities.Order;
import com.ak.order.food.restaurant.orders.entities.Payment;
import com.ak.order.food.restaurant.orders.model.OrderResponse;
import com.ak.order.food.restaurant.orders.repositories.OrderRepo;
import com.ak.order.food.restaurant.orders.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Override
    public OrderResponse createOrder(Order order) {

        orderRepo.save(order);

        Payment payment = new Payment();
        payment.setId(1);
        payment.setFinalAmount(order.getQtyValue() * order.getTotalPrice());
        payment.setTransaction_id(UUID.randomUUID().toString());
        payment.setDate(order.getDate());
        payment.setPayment_status(AppConstants.SUCCESS_STATUS);

        OrderResponse response = new OrderResponse();

        response.setOrderId(payment.getId());
        response.setTotalAmt(payment.getFinalAmount());
        response.setStatus(payment.getPayment_status());
        response.setTransactionId(payment.getTransaction_id());

        return response;
    }

    @Override
    public List<Order> getAllOrder() {
        return orderRepo.findAll();
    }

    @Override
    public Optional<Order> getViewById(Long id) {
        return orderRepo.findById(id);
    }

    @Override
    public List<Order> deleteOrder(Long id) {
        orderRepo.deleteById(id);
        return orderRepo.findAll();
    }
}
