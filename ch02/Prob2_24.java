import java.util.Scanner;


public class Prob2_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();

		System.out.print("Enter third number: ");
		int num3 = input.nextInt();

		System.out.print("Enter fourth number: ");
		int num4 = input.nextInt();

		System.out.print("Enter fifth number: ");
		int num5 = input.nextInt();
		
		int max = 0;
		int min = 0;
		
		if (num1 >= num2) {
			max = num1;
			min = num2;
		}
		
		if (num1 <= num2) {
			max = num1;
			min = num2;
		}
		
		
		if (num3 >= max) {
			max = num3;
		}
		if (num3 <= min) {
			min = num3;
		}
		
		if (num4 >= max) {
			max = num4;
		}
		if (num4 <= min) {
			min = num4;
		}
		
		if (num5 >= max) {
			max = num5;
		}
		if (num5 <= min) {
			min = num5;
		}
		
		System.out.printf("Maximum: %d%nMinimum: %d%n", max, min);
	}

}
