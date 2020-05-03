package com.redi.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

import com.redi.restaurant.desert.Icecream;
import com.redi.restaurant.maincourse.Basilpesto;
import com.redi.restaurant.menu.Dish;
import com.redi.restaurant.menu.Menu;
import com.redi.restaurant.starter.Salad;

public class Main{
		
	public static void main (String[] args) {
		ArrayList<String> mainIngredients = new ArrayList<String>( Arrays.asList("dill", "sour scream", "onion"));
		ArrayList<String> starterIngredients = new ArrayList<String>( Arrays.asList("potato", "carrot", "onion"));
		ArrayList<String> dessertIngredients = new ArrayList<String>( Arrays.asList("milk", "sugar", "sourc cream"));
		
		
		
		Dish testOne = new Basilpesto("Basil Pesto", 5.0, mainIngredients);
		Dish testTwo = new Salad("Salad", 15.0, starterIngredients);
		Dish testThree = new Icecream("Icecream", 10.0, dessertIngredients);
		
		
		Bill bill= new Bill();
		
		bill.addDish(testOne);
		bill.addDish(testTwo);
		bill.addDish(testThree);
		
		double totalAmount = bill.getTotal();
		bill.printBill(totalAmount);
	//
		Menu menureader = new Menu();
		menureader.bufferReader();
	
	}	
	
}