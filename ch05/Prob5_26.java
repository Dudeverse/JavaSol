import java.util.Scanner;

public class Prob5_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a four digit number: ");
		int number = input.nextInt();
		
		System.out.printf("Sum of the digits of %d is %d",number, sum_of_digits(number));

	}
	public static int sum_of_digits(int num) {
		int sum_of_digit = 0;
		
		int first_dig = num/1000;
		int remaining_digits = num%1000;

		int second_dig = remaining_digits/100;
		 remaining_digits = num%100;

		int third_dig = remaining_digits/10;
		 remaining_digits = num%10;

		int fourth_dig = remaining_digits/1;
		 remaining_digits = num%1;

		
		sum_of_digit= first_dig + second_dig + third_dig+ fourth_dig;
		
		return sum_of_digit;
	}
}
