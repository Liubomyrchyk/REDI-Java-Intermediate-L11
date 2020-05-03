package com.redi.restaurant.menu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Menu {
	
	
	public void bufferReader() {
	try {
		BufferedReader reader = new BufferedReader(new FileReader(
				"C:\\Users\\Qwert\\Desktop\\loadmenu.txt"));
		HashMap<String, String> map= new HashMap<String,String>();
		
			String line = reader.readLine();
			String[] splittedString=line.split(" ");
			map.put(splittedString[1], splittedString[2]);
		
			
			while (line != null) {		
			// read next line
			//	System.out.println(line);
				line = reader.readLine();
				splittedString=line.split(" ");
				map.put(splittedString[1], splittedString[2]);
			System.out.println("New loaded map of dishes: " + map);
		}
			
			
		//	map.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));
			
			
		reader.close();
		} catch (NullPointerException | IOException e) {
			e.printStackTrace();
		}
	System.out.println("end of this program!");
	}
}