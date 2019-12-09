// Imports
import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.Random;


import java.io.*;
//Project: Final Project
// Author: Max Marlatt
// Github: m-marlatt
// Description: Baseball
// Date: 12/6/19
// Version One

public class Finalproject {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Import activation / Try statement
		try { 
			FileWriter fw = new FileWriter("/Users/perplexedozzy/Desktop/winner.txt",true);
			PrintWriter outputFile = new PrintWriter(fw);
			Random rnd = new Random();
			Scanner keyboard = new Scanner(System.in);

			// Variables

			int menuChoice;
			int scores[][] = new int [2][1];
			int team1Score = 0;
			int team2Score = 0;


			// Array For Loop

			for(int row = 0; row < scores.length; row++)	
			{	


				for(int col = 0; col < scores[0].length; col++)
				{

					scores[row][col] = rnd.nextInt(10);
					if (row == 0)
					{
						team1Score += scores[row][col];
					}

					if (row == 1)
					{
						team2Score += scores[row][col];
					}

				}




				// Menu Do while


				do 

				{
					System.out.println("Game time! ");
					System.out.println("----------------");
					System.out.println("Would you like to ");
					System.out.println("1. Hit. ");
					System.out.println("Or. ");
					System.out.println("2. Quit. ");
					menuChoice = keyboard.nextInt();
					team1Score = rnd.nextInt(11);
					team2Score = rnd.nextInt(8);

					// Menu Switch

					switch(menuChoice)
					{
					case 1:
						if(team1Score<=6)
						{
							System.out.print("Team " + (row+1) + "\t");
							System.out.println("Hit!");
							System.out.print(scores[row][0] + "\t");
							System.out.print("\n");
						}								
						else
						{	System.out.println("Miss.");
						System.out.println("Try again.");
						}
						break;
					case 2:
						System.out.println("Thanks for playing! ");
						break;
					default:
						System.out.println("Please choose a valid option.");
					}	




				}while(menuChoice != 2);



				// Winner output line

				if(team1Score > team2Score)
				{
					outputFile.println("You win! Congratualtions! ");
				}

				// Close
				keyboard.close();
				outputFile.close();
			}

			// Catch 
		}
		catch(EOFException error)
		{
			System.out.println("You have reached the end of the file.");
			System.out.println("Error Message: " + error.getMessage());
		}
		catch (FileNotFoundException error)
		{
			System.out.println("Error Message: " + error.getMessage());
		}







	}

}
