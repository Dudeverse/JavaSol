import java.util.Scanner;
import java.lang.*;
public class Prob2_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		int radius = input.nextInt();
		
		System.out.printf("Diameter: %d%n", 2*radius);
		System.out.printf("Area: %f%n", (Math.PI)*radius*radius);
		System.out.printf("Circumference: %f%n", (Math.PI)*2*radius);

		

	}

}
