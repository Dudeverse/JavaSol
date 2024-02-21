// Sales Commission Calculator

import java.util.Scanner;

public class Prob3_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int account_number; 
		double balance_beginning;
		double charges; 
		double credits;
		double limit;
		double updated_balance;
		int count = 1;
		
		while (count != -1) {
			
			System.out.print("Enter account number or -1 to quit: ");
			account_number = input.nextInt();
			
			if (account_number == -1) {
				count = -1;
			}
			
			if (account_number>0) {
				System.out.print("Enter balance at beginning: ");
				balance_beginning = input.nextDouble();
				
				System.out.print("Enter charges accrued: ");
				charges = input.nextDouble();
				
				System.out.print("Enter credits applied: ");
				credits = input.nextDouble();
				
				System.out.print("Enter limit: ");
				limit = input.nextFloat();
				
				updated_balance = balance_beginning + charges - credits;
				System.out.printf("New balance: %.2f%n", updated_balance);

				System.out.println(updated_balance >= limit ?"credit limit exceeded" : "credits updated." );

			}
			
		}
		if (count==-1) {
			System.out.println("Job quit.");
		}
		
		
	}

}
