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
    private int orderId;

    private String date;

    private int qtyValue;

    @Column(name = "total_price")
    private Double totalAmount;

    @OneToMany(targetEntity = ItemsOrder.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private List<ItemsOrder> items;

    @Column(name = "restaurant_id")
    private Long restaurantId;

    @Column(name = "order_status")
    private String orderStatus;

    @OneToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL, mappedBy = "order")
    private Payment payment;


}
