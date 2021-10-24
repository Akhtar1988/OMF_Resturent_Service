package com.ak.order.food.restaurant.orders.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "order_item_table")
public class ItemsOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "menu_item_id")
    private Long menuItemId;

    @Column(name = "menu_item_name")
    private String menuItemName;

    private Double price;
    private Integer qty;
}
