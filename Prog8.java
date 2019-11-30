// Project: Project 8 + 9
// Author: Max Marlatt
// Github: m-marlatt
// Description: Grades input/output file
// Date: November 14, 2019
// Version 1

//Import
import java.io.*; //import output reading from a outside source
import java.util.Scanner;


public class Prog8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub





		try {

			// Open output file (save data)
			FileWriter fw = new FileWriter("/Users/perplexedozzy/Desktop/gradestotal.txt",true);
			PrintWriter outputFile = new PrintWriter(fw);

			// Open input file (reading data)
			File fr = new File("/Users/perplexedozzy/Desktop/grades.txt");
			Scanner inputFile = new Scanner(fr);


			int totalGrades = 0;
			int gradeCounter = 0;


			//Loop through the Input file
			while (inputFile.hasNext())
			{
				int grade = inputFile.nextInt();
				totalGrades += grade;
				gradeCounter ++;



			}



			// Output data to file
			outputFile.println("Grade Statistics");
			outputFile.println("=======================");
			outputFile.println("Total Points: " + totalGrades);
			outputFile.println("Total Assignments: " + gradeCounter);
			outputFile.println("Average Score: " + (totalGrades/gradeCounter));
			// Close Files
			outputFile.close();
			inputFile.close();

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
