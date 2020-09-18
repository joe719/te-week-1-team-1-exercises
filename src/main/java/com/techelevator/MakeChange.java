package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		
		Scanner scannerCost = new Scanner(System.in);
		Scanner scannerTotal = new Scanner(System.in);
		
		System.out.print("Welcome to Change Calculator!");
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("Please enter your total cost: ");
		String userInputCost = scannerCost.nextLine();
		double userCost = Double.parseDouble(userInputCost);
		
		System.out.println();
		
		System.out.print("Please enter cash given: ");
		String userInputMoney = scannerTotal.nextLine();
		double userMoney = Double.parseDouble(userInputMoney);
		
		
		double changeGiven = 0;
		changeGiven = userMoney - userCost;
		
		System.out.println();
		System.out.println("Your Change is: $" + changeGiven);
		
		scannerCost.close();
		scannerTotal.close();
		
	}

}
