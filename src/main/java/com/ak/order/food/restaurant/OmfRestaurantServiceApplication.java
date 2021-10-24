package com.ak.order.food.restaurant;

import com.ak.order.food.restaurant.restaurants.entities.Items;
import com.ak.order.food.restaurant.restaurants.entities.Restaurant;
import com.ak.order.food.restaurant.restaurants.serviceimp.RestaurantServicesImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Collections;

@SpringBootApplication
public class OmfRestaurantServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmfRestaurantServiceApplication.class, args);
	}
}
