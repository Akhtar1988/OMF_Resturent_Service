package com.ak.order.food.restaurant.controller;

import com.ak.order.food.restaurant.entities.Restaurant;
import com.ak.order.food.restaurant.model.RequestModel;
import com.ak.order.food.restaurant.model.ResponseModel;
import com.ak.order.food.restaurant.services.RestaurantServices;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RequestMapping(value = "/api/restaurant")
@RestController
public class RestaurantController {
    private final RestaurantServices restaurantServices;

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping
    public Restaurant createRestaurant(@RequestBody RequestModel requestModel) {
        return restaurantServices.createRestaurant(requestModel.getRestaurant());
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/getRestaurant")
    public ResponseModel getRestaurant() {
        return getResponse(restaurantServices.getRestaurent());
    }

    @GetMapping(value = "/{name}")
    public ResponseModel searchByName(@PathVariable(name = "name") String restaurantName) {
        return getResponse(restaurantServices.getRestaurantName(restaurantName));
    }

    @GetMapping(value = "/{budget}")
    public ResponseModel searchByBudget(@PathVariable(name = "budget") String searchQuery) {
        return getResponse(restaurantServices.getRestaurantBudget(searchQuery));
    }

    @GetMapping(value = "/{location}")
    public ResponseModel searchByLocation(@PathVariable(name = "location") String searchQuery) {
        return getResponse(restaurantServices.getRestaurantLocation(searchQuery));
    }

    @GetMapping(name = "/{cuisine}")
    private ResponseModel searchByCuisine(@PathVariable(name = "cuisine") String cuisine) {
        return getResponse(restaurantServices.getRestaurantCuisine(cuisine));
    }

    @GetMapping(value = "/{distance}")
    private ResponseModel searchByDistance(@PathVariable(name = "distance") String distance) {
        return getResponse(restaurantServices.getRestaurantDistance(distance));
    }

    private ResponseModel getResponse(List<Restaurant> restaurants) {
        ResponseModel response = new ResponseModel();
        response.setRestaurants_name(restaurants);
        return response;
    }
}
