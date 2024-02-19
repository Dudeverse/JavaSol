import java.util.Scanner;

public class Prob3_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int first_num = input.nextInt();
		
		System.out.print("Enter second number: ");
		int second_num = input.nextInt();
		
		if (first_num != second_num) {
			
			if (first_num > second_num) {
				System.out.println(1);
			} else {
				System.out.println(-1);
			}
			
		} else {
			System.out.println(0);
		}
	}

}
