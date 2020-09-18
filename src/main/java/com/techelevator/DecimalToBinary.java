package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner binaryNumbers = new Scanner(System.in);
		
		System.out.println("Welcome to the Decimal to Binary Converter!");
		System.out.println(" ");
		
		System.out.println("Please enter a series of decimal values (seperated by spaces): ");
		String inputDecimals = binaryNumbers.nextLine();
		String[] splitBinaryNumbers = inputDecimals.split(" ");
		
		for(int i = 0; i < splitBinaryNumbers.length; i++) {
			int intBinaryNumber = Integer.parseInt(splitBinaryNumbers[i]);
			int[] resultArray = new int[64];
			int index = 0;
			while(intBinaryNumber > 0) {
				int remainder = intBinaryNumber % 2;
				resultArray[index] = remainder;
				index++;
				intBinaryNumber = intBinaryNumber / 2;
				
			
			}
			for(int j=index; j >= 0; j--) {
				System.out.print(resultArray[j]);
			}
			System.out.println("");
		}
		
		
		
		binaryNumbers.close();
		

	}
}

