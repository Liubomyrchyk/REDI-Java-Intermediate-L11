package com.redi.restaurant.desert;

import java.util.List;

public class Cookie extends Dessert{
	public Cookie (String name, double price, List<String> ingredients)
	{
		super(name, price, ingredients);
	}

	@Override
	public String getDishSpeciality() {
		return "Vegetarian";
	}
	
} 