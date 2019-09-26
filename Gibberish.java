import java.util.Scanner;

public class Gibberish  { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Project: Project 1
		// Author: Max Marlatt
		// Github: m-marlatt
		// Description: Me attempting to program a price calculator
		// Date: 9/25/2019
		// Version One
		
		// Declare variables
		int price; int gallons;
	
		// Allowing keyboard for input of gas and price
			
		{	Scanner keyboard = new Scanner(System.in);
			System.out.println("What is the price of gas per gallon?"); 
			price = keyboard.nextInt();
		}
		{	
			System.out.println("How many gallons of gas?");
			Scanner keyboard = new Scanner(System.in);
			gallons = keyboard.nextInt();
			
				
		}
			int result = price * gallons;
			System.out.println("The cost you will pay before tax is " + result);
			
		
		
		
}
	}
		
				


