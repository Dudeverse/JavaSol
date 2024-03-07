import java.util.Scanner;

public class Prob5_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter side-1 (a real number > 0): ");
		double side1 = input.nextDouble();
		
		System.out.print("Enter side-2 (a real number > 0): ");
		double side2 = input.nextDouble();
		
		System.out.printf("Hypotneuse of side %f and side %f is: %f",  side1, side2, calcHypotenuse(side1,side2));
	}
	
	public static double calcHypotenuse (double side1, double side2) {
		return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
	}

}
