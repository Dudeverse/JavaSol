// Guess the number upgraded
import java.security.SecureRandom;
import java.util.Scanner;

public class Prob5_31 {

	public static void main(String[] args) {
		SecureRandom rand_num = new SecureRandom();
		Scanner input = new Scanner(System.in);
		
		int correct_number = 1+ rand_num.nextInt(1000);
		// to test the app, unccomment the next line
		// System.out.printf("testing the number: %d%n",correct_number);
		
		int guess = 0;
		int count = 0;
		
		if (guess!=correct_number) {
			System.out.printf("Guess the number:");
			guess = input.nextInt();
			count = 1;
			while(guess!=correct_number) {
				count = count + 1;
				if (guess > correct_number) {
					System.out.printf("Too high!\n");
					System.out.printf("Guess the number:");
					guess = input.nextInt();
				} else if (guess < correct_number) {
					System.out.printf("Too low!\n");
					System.out.printf("Guess the number:");
					guess = input.nextInt();
				}// end of if case
				
			}//end of while
			System.out.printf("Congrats!\n");
			System.out.printf("Number of guesses: %d%n",count);
			
			if (count<10) {
				System.out.println("Either you know the secret or you got lucky!");
			} else if (count>10) {
				System.out.println("You should be able to do better!");
			} else {
				System.out.println(" Aha! You know the secret!");
			}
			
			// code reaches here only if guess==correct_number
		}//end of main if case 
		
	}//end of main

}// end of classBody
