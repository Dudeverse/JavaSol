// Guess the number
import java.security.SecureRandom;
import java.util.Scanner;

public class Prob5_30 {

	public static void main(String[] args) {
		SecureRandom rand_num = new SecureRandom();
		Scanner input = new Scanner(System.in);
		
		int correct_number = 1+ rand_num.nextInt(1000);
		// to test the app, unccomment the next line
		//System.out.printf("testing the number: %d%n",correct_number);
		
		
		System.out.printf("Guess the number:");
		int guess = input.nextInt();
		
		if (guess!=correct_number) {
			while(guess!=correct_number) {
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
			System.out.printf("Congrats!");// code reaches here only if guess==correct_number
		}//end of main if case 
		
	}//end of main

}// end of classBody
