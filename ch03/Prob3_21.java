import java.util.Scanner;

public class Prob3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int counter = 1;		
		int largest = 0;
		
		while (counter<=10) {
			System.out.print("Enter number of units: ");
			int number = input.nextInt();
			counter = counter + 1;
			if (number > largest) {
				largest = number;
			}
		}
		System.out.printf("Largest number is %d%n", largest);
		
	}

}
