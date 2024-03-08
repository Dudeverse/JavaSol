import java.util.Scanner;

public class Prob5_27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num1 = input.nextInt();
		System.out.print("Enter another number: ");
		int num2 = input.nextInt();
		
		System.out.printf("GCD of %d and %d is %d", num1, num2, gcd (num1,num2));
	}
	
	public static int gcd(int num1, int num2) {
		int temp;
		while (num2!=0) {
			temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		return num1;
	}

}
