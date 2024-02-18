import java.util.Scanner;

public class Prob2_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num1 = input.nextInt();
		
		System.out.print("Enter a 2nd number: ");
		int num2 = input.nextInt();
		
		if ((num1*3) % (num2*2) == 0) {
			System.out.println("OK");

		}
		if ((num1*3) % (num2*2) != 0) {
			System.out.printf("%d",(num1*3)%(num2*2) );

		}
		
	}

}
