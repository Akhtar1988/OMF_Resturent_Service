package com.ak.order.food.restaurant.orders.serviceimp;

import com.ak.order.food.restaurant.orders.constants.AppConstants;
import com.ak.order.food.restaurant.orders.entities.ItemsOrder;
import com.ak.order.food.restaurant.orders.entities.Order;
import com.ak.order.food.restaurant.orders.entities.Payment;
import com.ak.order.food.restaurant.orders.model.OrderResponse;
import com.ak.order.food.restaurant.orders.repositories.OrderRepo;
import com.ak.order.food.restaurant.orders.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepo orderRepo;

    @Override
    public OrderResponse createOrder(Order order) {
       return getCreateOrder(order);
    }

    private OrderResponse getCreateOrder(Order order){

        Payment payment = new Payment();
        payment.setId(order.getOrderId());
        payment.setFinalAmount(calculatedAmount(order.getItems()));
        payment.setTransaction_id(UUID.randomUUID().toString());
        payment.setDate(order.getDate());
        payment.setPayment_status(AppConstants.SUCCESS_STATUS);
        payment.setOrder(order);
        order.setPayment(payment);
        orderRepo.save(order);

        OrderResponse response = new OrderResponse();
        response.setPayment(payment);
        response.setOrder(order);
        return response;
    }

    public Double calculatedAmount(List<ItemsOrder> items) {
        double amount = 0.00;
        if (items.size()> 0){
            for (ItemsOrder item : items) {
                amount = amount + (item.getQty() * item.getPrice());
            }
            return amount;
        }else {
            return 0.0;
        }
    }
    @Override
    public List<Order> getAllOrder() {
        return orderRepo.findAll();
    }

    @Override
    public Order getViewById(Long id) {
        return orderRepo.getById(id);
    }

    @Override
    public List<Order> deleteOrder(Long id) {
        orderRepo.deleteById(id);
        return orderRepo.findAll();
    }

    @Override
    public Payment makePayment(Payment payment) {
        payment.setPayment_status(paymentProcessing());
        payment.setTransaction_id(UUID.randomUUID().toString());
        return payment;
    }

    @Override
    public Payment refundAmount(Payment payment) {
        payment.setPayment_status(refundPaymentProcessing().toString());
        return payment;
    }

    public String paymentProcessing() {
        //TODO HERE NEED TO INTEGRATE THE SDK PAYMENT GETAWAY ACCORDINGLY
        return new Random().nextBoolean() ? AppConstants.SUCCESS_STATUS : AppConstants.FAILED;
    }

    private Object refundPaymentProcessing() {
        //TODO HERE NEED TO INTEGRATE THE SDK PAYMENT GETAWAY ACCORDINGLY
        return new Random().nextBoolean() ? AppConstants.REFUND : AppConstants.FAILED;
    }
}
