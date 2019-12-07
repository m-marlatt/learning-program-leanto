import java.util.Scanner;	
		//Project: Project 6
		// Author: Max Marlatt
		// Github: m-marlatt
		// Description: Bank Account
		// Date: 11/20/19
		// Version One



public class Account {
// Account information
	double withdraw;
	double balance = 0.00; 
	Scanner keyboard = new Scanner(System.in);

public double Balance()
{
 return balance;
}

public double Withdraw() 
{	
	
	
	if(withdraw > balance)
	{
		System.out.println("Insufficient balance. ");
	}
	else
		withdraw = keyboard.nextDouble();

	return withdraw;

}
public double Deposit()
{
	double deposit = keyboard.nextDouble();
	
	return deposit;
 
}





}
