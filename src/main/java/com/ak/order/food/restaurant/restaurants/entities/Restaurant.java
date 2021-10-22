package com.ak.order.food.restaurant.restaurants.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "restaurant_table")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "restaurant_id")
    private Long id;


    @Column(name = "restaurant_name")
    private String restName;

    @Column(name = "budget")
    private String budget;

    @Column(name = "cuisine_name")
    private String cuisine;

    @Column(name = "location_name")
    private String location;

    @Column(name = "distance")
    private String distance;

    @OneToMany(targetEntity = Items.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurant_id",referencedColumnName = "restaurant_id")
    private List<Items> items;

}
