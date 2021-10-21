package com.ak.order.food.restaurant.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
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
    private Double budget;

    @Column(name = "cuisine")
    private String cuisine;

    @Column(name = "location_name")
    private String location;

    @Column(name = "distance")
    private Double distance;

    @OneToMany(targetEntity = Items.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurant_id",referencedColumnName = "restaurant_id")
    @ToString.Exclude
    private List<Items> items;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Restaurant that = (Restaurant) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
