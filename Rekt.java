import java.util.Scanner;

public class Rekt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Project: Project 3
		// Author: Max Marlatt
		// Github: m-marlatt
		// Description: Numbers with countdown
		// Date: 10/2/19
		// Version One
		
		//Data
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("Input user name.");
		String username = Keyboard.next();
		System.out.println("Hello " + username);
		System.out.println("Input a number between 0-100. ");
		int number = Keyboard.nextInt();
		
		
		//If for 0-100
		if(number>100)
			{
				System.out.println("Please choose a lower number");
			}
		else 
			{
				System.out.println("Thank you for your input. Now counting down till system 32 deletion.");
			
				
		for(int i = number;i>0;i--)
			{
				System.out.println(i--);
			
		}
		}
		
			


		
}}
