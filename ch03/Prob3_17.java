// Sales Commission Calculator

import java.util.Scanner;

public class Prob3_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int miles_driven; 
		int gallons_used;
		double miles_per_gallon; 
		double total_miles_per_gallon = 0;

		int count = 1;
		
		while (count != -1) {
			
			System.out.print("Enter miles driven or -1 to quit: ");
			miles_driven = input.nextInt();

			if (miles_driven == -1) {
				count = -1;
			}
			
			if (miles_driven > 0) {
				System.out.print("Enter gallons used: ");
				gallons_used = input.nextInt();
				
				miles_per_gallon = (double) miles_driven/ gallons_used;
				System.out.printf("Miles per gallon for this trip: %.2f%n", miles_per_gallon);
				
				total_miles_per_gallon += miles_per_gallon;
				System.out.printf("Combined miles per gallon so far: %.2f%n", total_miles_per_gallon);

			}
			
		}
		if (count==-1) {
			System.out.println("Job quit.");
		}
		
		
	}

}
