import java.util.Scanner;

public class Prob2_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num1 = input.nextInt();
		
		if (num1%3==0) {
			System.out.printf("%d is divisible by 3%n", num1);
		}
		
		if (num1%3!=0) {
			System.out.printf("%d is NOT divisible by 3%n", num1);
		}

	}

}
