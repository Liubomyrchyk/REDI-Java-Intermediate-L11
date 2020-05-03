package com.redi.restaurant.menu;

import java.util.List;

public interface Dish{
	
	String getName();
	double getPrice();
	List<String> getIngredients();
	String getDishSpeciality();
	
}