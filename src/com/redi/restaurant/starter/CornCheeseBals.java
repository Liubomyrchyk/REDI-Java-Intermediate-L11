package com.redi.restaurant.starter;


import java.util.List;

public class CornCheeseBals extends Starter{
	
	
	public CornCheeseBals(String name, double price, List<String> ingredients){
		super(name, price, ingredients);	
	}
	
	@Override
	public String getDishSpeciality() {
		return "Vegan";
	}
}