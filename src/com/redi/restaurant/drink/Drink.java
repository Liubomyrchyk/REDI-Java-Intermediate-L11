package com.redi.restaurant.drink;

import java.util.List;

public class Drink{
	private String name;
	private double price;
	private List<String> ingredients;
	
	
	public Drink(String name, double price, List<String> ingredients){
		this.name=name;
		this.price=price;
		this.ingredients=ingredients;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public List<String> getIngredients() {
		return ingredients;
	}


	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	
}