import java.util.Scanner;

public class Prob2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = input.nextInt();
		
		int num_sq = num*num;
		
		if (num > 100) {
			System.out.printf("%d > 100%n", num);
		}
		
		if (num < 100) {
			System.out.printf("%d < 100%n", num);
		}
		
		if (num == 100) {
			System.out.printf("%d = 100%n", num);
		}
		
		if (num != 100) {
			System.out.printf("%d != 100%n", num);
		}
		
		if (num_sq > 100) {
			System.out.printf("%d > 100%n", num_sq);
		}
		
		if (num_sq < 100) {
			System.out.printf("%d < 100%n", num_sq);
		}
		
		if (num_sq == 100) {
			System.out.printf("%d = 100%n", num_sq);
		}
		
		if (num_sq != 100) {
			System.out.printf("%d != 100%n", num_sq);
		}

	}

}
