package com.ak.order.food.restaurant.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Double budget;

    @Column(name = "cuisine")
    private String cuisine;

    @Column(name = "location_name")
    private String location;

    @Column(name = "distance")
    private Double distance;

    @OneToMany(targetEntity = Items.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurant_id",referencedColumnName = "restaurant_id")
    private List<Items> items;

}
