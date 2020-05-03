package com.redi.restaurant.maincourse;

import java.util.List;

public class Pizza extends MainCourse{

	public Pizza(String name, double price, List<String> ingredients) {
		super(name, price, ingredients);
	}
	
	@Override
	public String getDishSpeciality() {
		return "Vegetarian";
	}
}