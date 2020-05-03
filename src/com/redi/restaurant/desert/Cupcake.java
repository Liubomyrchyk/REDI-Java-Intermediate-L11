package com.redi.restaurant.desert;

import java.util.List;

public class Cupcake extends Dessert{
	public Cupcake (String name, double price, List<String> ingredients)
	{
		super(name, price, ingredients);
	}
	
	@Override
	public String getDishSpeciality() {
		return "Gluten free";
	}
} 