package com.redi.restaurant.starter;


import java.util.List;

public class Soup extends Starter{
	
	
	public Soup(String name, double price, List<String> ingredients){
		super(name, price, ingredients);	
	}
	
	@Override
	public String getDishSpeciality() {
		return "Vegetarian";
	}
}