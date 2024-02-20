import java.util.Scanner;

public class Prob3_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a five digit number: ");
		int num = input.nextInt();
		
		int num_of_digits = 5;
		int digit = 0;
		int remaining_digits = 1;
		
		int first_dig = 0;
		int second_dig = 0;
		int fourth_dig = 0;
		int fifth_dig = 0;
		
		while (num_of_digits > 0) {
			
			// grab the leftmost digit
			digit = num%10;
			// separate the right digits
			remaining_digits = num/10;
			
			// assign digits to their appropriate variables
				if (num_of_digits == 5) {
					first_dig = digit;
				} else if (num_of_digits == 4) {
					second_dig = digit;
				} else if (num_of_digits == 2) {
					fourth_dig = digit;
				} else if (num_of_digits == 1) {
					fifth_dig = digit;
				} 	
				
			// to progress the while loop and eventually terminate it
			num_of_digits = num_of_digits - 1;
			
			// updating the num so in the next iteration, it can work the rightmost digits 
			num = remaining_digits;

			// edge cases where user could have entered anything other than a 5 digit number
			
			if (num_of_digits == 0) { // in case user enters a number with more than 5 digits
				if (remaining_digits > 0) {
					System.out.print("Enter a five digit number: ");
					num = input.nextInt();
					// loop reset
					num_of_digits = 5;
					digit = 0;
					remaining_digits = 1;
					first_dig = 0;
					second_dig = 0;
					fourth_dig = 0;
					fifth_dig = 0;
				}
				
			} else if (num_of_digits < 5) { // in case user enters a number with less than 5 digits
				if (remaining_digits == 0) {
					System.out.print("Enter a five digit number: ");
					num = input.nextInt();
					// loop reset
					num_of_digits = 5;
					digit = 0;
					remaining_digits = 1;
					first_dig = 0;
					second_dig = 0;
					fourth_dig = 0;
					fifth_dig = 0;
				}
			}
			

		}
		
		// palindrome check. Since it is a five digit number, checking digits other than the middle (third digit) is sufficient.
		if (first_dig == fifth_dig) {
			if (second_dig == fourth_dig) {
				System.out.printf("The number is a palindrome!");
			}
		} else {
			System.out.printf("The number is  not a palindrome!");
		}

	}

}
