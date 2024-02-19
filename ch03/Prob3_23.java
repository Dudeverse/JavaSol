import java.util.Scanner;

public class Prob3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int counter = 1;		
		int largest = 0;
		int next_largest = 0;
		
		while (counter<=10) {
			System.out.print("Enter number of units: ");
			int number = input.nextInt();
			counter = counter + 1;
			if (number > largest) {
				next_largest = largest;
				largest = number;
			}
		}
		System.out.printf("Largest number is %d%n", largest);
		System.out.printf("Next largest number is %d%n", next_largest);

		
	}

}
