package com.ak.order.food.restaurant.serviceimp;

import com.ak.order.food.restaurant.entities.Restaurant;
import com.ak.order.food.restaurant.repositories.RestaurantRepository;
import com.ak.order.food.restaurant.services.RestaurantServices;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class RestaurantServicesImpl implements RestaurantServices {

    @Autowired
    private RestaurantRepository repository;
    private List<Restaurant> list;

    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {
        return repository.save(restaurant);
    }

    @Override
    public List<Restaurant> getRestaurantName(String searchQuery) {
        return search(searchQuery);
    }

    @Override
    public List<Restaurant> getRestaurantBudget(String searchQuery) {
        return search(searchQuery);
    }

    @Override
    public List<Restaurant> getRestaurantLocation(String searchQuery) {
        return search(searchQuery);
    }

    @Override
    public List<Restaurant> getRestaurent() {
        return repository.findAll();
    }

    @Override
    public List<Restaurant> getRestaurantCuisine(String cuisine) {
        return search(cuisine);
    }

    @Override
    public List<Restaurant> getRestaurantDistance(String distance) {
        return search(distance);
    }


    private List<Restaurant> search(String searchQuery) {
        list = new ArrayList<>();
        List<Restaurant> ss = repository.findAll();
        ss.forEach(restaurant1 -> {
            if (searchQuery.equals(restaurant1.getRestName())) {
                Restaurant restaurant2 = new Restaurant();
                restaurant2.setRestName(searchQuery);
                list.add(restaurant2);
            }
        });
        return list;
    }
}
