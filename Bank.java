import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Values needed
		Scanner keyboard = new Scanner(System.in);
		int menuChoice = 0;
		Account checking = new Account();



		// Menu Do loop

		do
		{
			System.out.println("Welcome to MMNC Bank ");
			System.out.println("----------------");
			System.out.println("1.) Display Balance Information");
			System.out.println("2.) Withdraw Funds ");
			System.out.println("3.) Deposit Funds ");
			System.out.println("4.) Exit");
			System.out.println("What would you like to do?");
			menuChoice = keyboard.nextInt();

			// Menu Switch
			switch (menuChoice)
			{
			case 1:
				System.out.println(checking.Balance());
				break;
			case 2:

				System.out.println(checking.Withdraw() + "has been taken from your current balance. ");

				break;
			case 3:

				System.out.println(checking.Deposit() + " has been added to your current balance. ");

				break;
			case 4:
				System.out.println("Thank you for choosing MMNC Bank.");

				break;
			default:

				System.out.println("Please choose a valid option. ");
			}
		}while(menuChoice != 4);

		//Closing

		keyboard.close();
	}

}
