import java.util.Scanner;

public class Prob3_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a target: ");

		int target = input.nextInt();		
		
		int sum_so_far = 0;
		
		while (sum_so_far < target) {
			System.out.print("Enter a number: ");
			int number = input.nextInt();
			
			sum_so_far += number;
			
			System.out.printf("Sum so far: %d%n", sum_so_far);

		}
		if (sum_so_far == target) {
			System.out.println("target reached!");

		} else if (sum_so_far > target) {
			System.out.println("target exceeded!");
		}

		
	}

}
