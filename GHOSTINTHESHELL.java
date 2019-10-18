import java.util.Scanner;


public class GHOSTINTHESHELL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Project: Project 2
				// Author: Max Marlatt
				// Github: m-marlatt
				// Description: Calculator with choices
				// Date: 10/1/19
				// Version 3
				
		// Start Scanner and Declare Variables
		
		Scanner keyboard = new Scanner (System.in);
		
		// Collecting Variables
		{
			System.out.println("Input 1st number.");
			double number1 = keyboard.nextInt();
			System.out.println("Input 2nd number.");
			double number2 = keyboard.nextInt();
			System.out.println("Input 3rd number.");
			double number3 = keyboard.nextInt();	
			double result = number1 + number2;
			double result2 = number1 - number2;
			double result3 = number1 * number2;
			double result4 = number1 / number2;
			
			int menuChoice;
			
			//Do While Loop for menu.
				
			do
		{	
			
			System.out.println("Main Menu");
			System.out.println("=========");
			System.out.println("1.) Add");
			System.out.println("2.) Subtract");
			System.out.println("3.) Multiply");
			System.out.println("4.) Divide");
			System.out.println("5.) Exit");
			 menuChoice = keyboard.nextInt();
			
			 //Switch for menu
			 
			 switch (menuChoice)
			 {
			 	case 1: 
			 		 System.out.println("Add.");	
			 		 System.out.println(number1 + " plus " + number2 + " equals " + result);
			 		
			 		 if(number3 > result)
						 System.out.println(number3 + " is greater than " + result);
					 else 
					 	 System.out.println(number3 + " is less than " + result);
			 		
			 		 break;
				case 2:
					System.out.println("Subtract.");
					System.out.println(number1 + " minus " + number2 + " equals " + result2);
					
					if(number3 > result2)
						System.out.println(number3 + " is greater than " + result2);
					else
						System.out.println(number3 + " is less than " + result2);
					
					break;
				case 3:
					System.out.println("Multiply.");
					System.out.println(number1 + " times " + number2 + " equals " + result3);
					
					if(number3 > result3)
						System.out.println(number3 + " is greater than " + result3);
					else 
						System.out.println(number3 + " is less than " + result3);
					
					break;
				case 4:
					System.out.println("Divide.");
					System.out.println(number1 + " divided " + number2 + " equals " + result4);

					if(number3 > result4)
						System.out.println(number3 + " is greater than " + result4);
					else
						System.out.println(number3 + " is less than " + result4);
					
					break;
				case 5:
					System.out.println("Exiting.");
					break;
				default:
					System.out.println("Please choose a valid choice");
			 }
			}while(menuChoice !=5);	
				keyboard.close();
	
	
	

}
	}}



