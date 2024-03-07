import java.util.Scanner;

public class Prob5_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a side(an integer > 0): ");
		int side = input.nextInt();
		
		squareOfAsterisks(side);

	}
	
	public static void squareOfAsterisks(int side) {
		for (int i = 1; i<=side; i++) {
			for (int k = 1; k<=side; k++) {
				System.out.print("*");
				
			}System.out.println();
		}
	}
	
}
