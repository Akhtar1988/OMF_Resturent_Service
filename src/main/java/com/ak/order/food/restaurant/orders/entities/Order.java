package com.ak.order.food.restaurant.orders.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "order_table")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    private Long orderId;

    private String name;

   // @GeneratedValue(strategy = GenerationType.AUTO)
    private String date;

    private int qtyValue;

    @Column(name = "total_price")
    private Double totalPrice;

    @OneToOne
    @JoinColumn(name = "payment_payment_id")
    private Payment payment;


}
