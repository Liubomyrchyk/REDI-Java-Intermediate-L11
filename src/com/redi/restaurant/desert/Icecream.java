package com.redi.restaurant.desert;

import java.util.List;

public class Icecream extends Dessert{
	public Icecream (String name, double price, List<String> ingredients)
	{
		super(name, price, ingredients);
	}
	
	@Override
	public String getDishSpeciality() {
		return "Gluten free";
	}
} 