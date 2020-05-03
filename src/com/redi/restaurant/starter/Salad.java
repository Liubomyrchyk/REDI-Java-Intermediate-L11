package com.redi.restaurant.starter;


import java.util.List;

public class Salad extends Starter{
	
	
	public Salad(String name, double price, List<String> ingredients){
		super(name, price, ingredients);
	}
	
	@Override
	public String getDishSpeciality() {
		return "Gluten free";
	}
	
}