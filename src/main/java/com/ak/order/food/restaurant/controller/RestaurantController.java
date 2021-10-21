package com.ak.order.food.restaurant.controller;

import com.ak.order.food.restaurant.entities.Restaurant;
import com.ak.order.food.restaurant.model.RequestModel;
import com.ak.order.food.restaurant.services.RestaurantServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping(value = "api/restaurant")
public class RestaurantController {

    private RestaurantServices restaurantServices;

    @PostMapping(value = "/create")
    public Restaurant createRestaurant(@RequestBody RequestModel requestModel){
            return restaurantServices.createRestaurant(requestModel.getRestaurant());
    }

    @GetMapping(value = "/name")
    public List<Restaurant> searchByName(@PathVariable(name ="name") String restaurantName , Restaurant restaurant){
       return restaurantServices.getRestaurantName(restaurantName ,  restaurant);
    }

    @GetMapping(value = "{/budget}")
    public List<Restaurant> searchByBudget(@PathVariable("budget")String searchQuery , Restaurant restaurant){
       return restaurantServices.getRestaurantBudget(searchQuery , restaurant);
    }

    @GetMapping(value = "{/location}")
    public List<Restaurant> searchByLocation(@PathVariable("location") String searchQuery , Restaurant restaurant){
        return restaurantServices.getRestaurantLocation(searchQuery , restaurant);
    }
}
