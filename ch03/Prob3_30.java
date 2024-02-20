import java.util.Scanner;

public class Prob3_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the base of triangle: ");
		int base = input.nextInt();
		int height = base;
		
		while (base > 0) {
			while (height > 0) {
				System.out.print("*");
				height = height - 1;
			}
			System.out.println();
			base = base - 1;
			height = base;
		}

	}

}
