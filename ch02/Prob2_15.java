import java.util.Scanner;

public class Prob2_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		
		int sq_1 = num1*num1;
		int sq_2 = num2*num2;
		int sum_Sq = sq_1 + sq_2;
		int diff_Sq = sq_1 - sq_2;
		System.out.printf("Square of first number: %d%nSquare of second number: %d%nSum of squares: %d%nDifference of squares: %d%n", sq_1, sq_2, sum_Sq, diff_Sq);
		


		
	}

}
