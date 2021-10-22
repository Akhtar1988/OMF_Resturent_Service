package com.ak.order.food.restaurant.restaurants.serviceimp;

import com.ak.order.food.restaurant.restaurants.entities.Restaurant;
import com.ak.order.food.restaurant.restaurants.repositories.RestaurantRepository;
import com.ak.order.food.restaurant.restaurants.services.RestaurantServices;
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
    public List<Restaurant> getRestaurantName(String searchName) {
        return searchByName(searchName);
    }

    @Override
    public List<Restaurant> getRestaurantBudget(String searchBudget) {
        return searchByBudget(searchBudget);
    }

    @Override
    public List<Restaurant> getRestaurantLocation(String searchLocation) {
        return searchByLocation(searchLocation);
    }

    @Override
    public List<Restaurant> getRestaurent() {
        return repository.findAll();
    }

    @Override
    public List<Restaurant> getRestaurantCuisine(String cuisine) {
        return searchByCuisine(cuisine);
    }

    @Override
    public List<Restaurant> getRestaurantDistance(String distance) {
        return searchByDistance(distance);
    }


    private List<Restaurant> searchByName(String searchQuery) {
        list = new ArrayList<>();
        List<Restaurant> ss = repository.findAll();
        ss.forEach(restaurant1 -> {
            if (searchQuery.equalsIgnoreCase(restaurant1.getRestName())) {
                Restaurant restaurant2 = new Restaurant();
                restaurant2.setRestName(searchQuery);
                list.add(restaurant2);
            }
        });
        return list;
    }

    private List<Restaurant> searchByBudget(String searchQuery) {
        list = new ArrayList<>();
        List<Restaurant> ss = repository.findAll();
        ss.forEach(restaurant1 -> {
            if (searchQuery.equals(restaurant1.getBudget())) {
                Restaurant restaurant2 = new Restaurant();
                restaurant2.setBudget(searchQuery);
                list.add(restaurant2);
            }
        });
        return list;
    }

    private List<Restaurant> searchByLocation(String searchQuery) {
        list = new ArrayList<>();
        List<Restaurant> ss = repository.findAll();
        ss.forEach(restaurant1 -> {
            if (searchQuery.equals(restaurant1.getLocation())) {
                Restaurant restaurant2 = new Restaurant();
                restaurant2.setLocation(searchQuery);
                list.add(restaurant2);
            }
        });
        return list;
    }

    private List<Restaurant> searchByCuisine(String searchQuery) {
        list = new ArrayList<>();
        List<Restaurant> ss = repository.findAll();
        ss.forEach(restaurant1 -> {
            if (searchQuery.equals(restaurant1.getCuisine())) {
                Restaurant restaurant2 = new Restaurant();
                restaurant2.setCuisine(searchQuery);
                list.add(restaurant2);
            }
        });
        return list;
    }

    private List<Restaurant> searchByDistance(String searchQuery) {
        list = new ArrayList<>();
        List<Restaurant> ss = repository.findAll();
        ss.forEach(restaurant1 -> {
            if (searchQuery.equals(restaurant1.getDistance())) {
                Restaurant restaurant2 = new Restaurant();
                restaurant2.setDistance(searchQuery);
                list.add(restaurant2);
            }
        });
        return list;
    }
}
