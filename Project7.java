
//Imports
import java.util.Random;
import java.util.Scanner;

//Project: Project 7
// Author: Max Marlatt
// Github: m-marlatt
// Description: Array Sport Game
// Date: 11/20/19
// Version One


public class Project7 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner and Variables
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
		// Systems
		System.out.println("Welcome to our game of Necesitty. The game that had to be created");
		System.out.println("How many games would you like to play?");
		int userInput = keyboard.nextInt();
		//System.out.println("Team 1\tTeam 2");
		//Starting Array
		{
			int[][]scores = new int [2][userInput];
			int team1Score = rnd.nextInt(10);
			int team2Score = rnd.nextInt(10);

			for(int row = 0; row < scores.length; row++)	
			{	
				System.out.print("Team " + (row+1) + "\t");

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
					System.out.print(scores[row][col] + "\t");
				}

				System.out.print("\n");
				// if row == 0
			}	// add scores[row][col] in team1score



			if (team1Score > team2Score)
			{
				System.out.println("Team 1 wins! ");
			}
			else 
				System.out.println("Team 2 wins! ");


			keyboard.close();

		}

	}}
