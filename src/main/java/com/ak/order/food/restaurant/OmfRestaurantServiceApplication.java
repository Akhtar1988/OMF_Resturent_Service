package com.ak.order.food.restaurant;

import com.ak.order.food.restaurant.entities.Items;
import com.ak.order.food.restaurant.entities.Restaurant;
import com.ak.order.food.restaurant.serviceimp.RestaurantServicesImpl;
import com.ak.order.food.restaurant.services.RestaurantServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Collections;

@SpringBootApplication
public class OmfRestaurantServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OmfRestaurantServiceApplication.class, args);
		RestaurantServicesImpl restaurantServicesImpl = context.getBean("restaurantServicesImpl" , RestaurantServicesImpl.class);

		Restaurant restaurant1 = new Restaurant();
		restaurant1.setRestName("Moti");
		restaurant1.setBudget("10.0");
		restaurant1.setDistance("4.0");
		restaurant1.setCuisine("Food");
		restaurant1.setLocation("Bangalore");
		Items items = new Items();
		items.setItemName("Paneer");
		items.setDescription("Paneer is very spicy");
		items.setOffer(50);
		items.setPrice(150.0);
		restaurant1.setItems(Collections.singletonList(items));

		restaurantServicesImpl.createRestaurant(restaurant1);
	}

}
