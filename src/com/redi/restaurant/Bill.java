package com.redi.restaurant;

import java.util.ArrayList;
import java.util.List;

import com.redi.restaurant.menu.Dish;

public class Bill {
	private List <Dish> items= new ArrayList<>();
	
	public void addDish(Dish dish ) {
		items.add(dish);
	}
	
	public double getTotal() {
		double total=0;
		for (Dish item: items) {
			total+=item.getPrice();
		}
		return total;
	}
	
	public void printBill(double total) {
		int counterItems=1;
		for (Dish item: items) {
			String name = item.getName();
		System.out.println(String.format("Position Name Price \n %d %s %f \n", counterItems, name, item.getPrice()));
		counterItems++;
		}
		System.out.println("Total amount is " + total);
	}
}