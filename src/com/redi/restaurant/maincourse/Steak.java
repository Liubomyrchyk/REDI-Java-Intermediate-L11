package com.redi.restaurant.maincourse;

import java.util.List;

public class Steak extends MainCourse{

	public Steak(String name, double price, List<String> ingredients) {
		super(name, price, ingredients);
	}
	
	@Override
	public String getDishSpeciality() {
		return "Gluten free";
	}
	
}