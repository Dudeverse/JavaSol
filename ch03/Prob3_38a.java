import java.util.Scanner;

public class Prob3_38a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int num = input.nextInt();
		int count = num;
		int product_So_far = num;
		int a = num;
		int b = a - 1;
		
		if (count==0) {
			System.out.println("Factorial of 0 is 1");
		} else if (count==1) {
			System.out.println("Factorial of 1 is 1");
		} else {
			while (count>1) {
				product_So_far = a * b;
				b = b - 1;
				a = product_So_far;
				count = count - 1;
				
			}
			System.out.printf("factorial is: %d",product_So_far);
		}
	}

}
