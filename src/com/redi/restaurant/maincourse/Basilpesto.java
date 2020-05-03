package com.redi.restaurant.maincourse;

import java.util.List;

public class Basilpesto extends MainCourse{

		public Basilpesto(String name, double price, List<String> ingredients) {
			super(name, price, ingredients);
		}
		
		@Override
		public String getDishSpeciality() {
			return "Vegan";
		}
	}
