
package com.redi.restaurant.maincourse;

import java.util.List;

import com.redi.restaurant.menu.Dish;

abstract class MainCourse implements Dish {
	private String name;
	private double price;
	private List<String> ingredients;
	
	public MainCourse(String name, double price, List<String> ingredients){
		this.name=name;
		this.price=price;
		this.ingredients=ingredients;
	}
	
	public abstract String getDishSpeciality();
	
	
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