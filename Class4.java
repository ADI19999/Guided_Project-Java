import java.util.Scanner;
public class Class4 {

	public static void main(String[] args) {
		System.out.println("Bank Admin Menu:");
		System.out.println("Please enter a menu option:");
		System.out.println("(1): Add customer to the bank");
		System.out.println("(2): Change customer name");
		System.out.println("(3): Check account balance");
		System.out.println("(4): Modify account balance");
		System.out.println("(5): Summary of all accounts");
		System.out.println("(-1): Quit");
		
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		System.out.println(userInput);
		
		int size=0;
		double[] accountBalances = new double[250];
		String[] accountNames = new String[250];
		
		if(userInput == 1) {
			System.out.println("Bank Add Customer Menu:");
			System.out.println("Please enter an account balance");
			double balance = input.nextDouble();
			accountBalances[size] = balance;
			System.out.println("Please enter an account name");
			input.hasNextLine();
			String name = input.nextLine();
			accountNames[size] = name;
			System.out.println("Customer ID is: " + size);
			size=size+1;
			
		}
		else if(userInput == 2) {
			
		}
        else if(userInput == 3) {
			
		}
        else if(userInput == 4) {
	
        }
        else if(userInput == 5) {
	
        }
        else if(userInput == -1) {
	
        }
        else {
        	
        }
	}
}
