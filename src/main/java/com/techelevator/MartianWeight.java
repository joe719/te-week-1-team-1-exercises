package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {
	
	



	public static void main(String[] args) {
		
		Scanner earthWeights = new Scanner(System.in);
		
		System.out.print("Your weight on Earth vs. Mars");
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("Please enter a series of Earth weights (space seperated)");
		
		String userEarthWeights = earthWeights.nextLine();
		
		String[] splitEarthWeight = userEarthWeights.split(" ");
		
		for(int i = 0; i < splitEarthWeight.length; i++) {
			double doubleEarthWeight = Double.parseDouble(splitEarthWeight[i]);
			double marsWeight = .378 * doubleEarthWeight;
			System.out.println(splitEarthWeight[i] + " Lbs on Earth, or " + marsWeight + "lbs on Mars");
		}
		
			
		
		System.out.println();
		
		System.out.println();
		System.out.println();
		
		earthWeights.close();
		

	}

}
