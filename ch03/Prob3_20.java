import java.util.Scanner;

public class Prob3_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int citizen = 1;
		float earnings = 0; 
		float tax;
		
		while (citizen < 4) {
			System.out.printf("Enter citizen- %d's earnings: ", citizen );
			 earnings = input.nextFloat();
			
			if (earnings >= 30000) {
				tax = (float) (20 ) /( 100) * earnings;
				System.out.printf("Citizen-%d's tax is: %.2f%n", citizen, tax );

			} else {
				tax = (float) (15) / (100) * earnings;
				System.out.printf("Citizen-%d's tax is: %.2f%n",citizen, tax );

			}
			

			citizen = citizen + 1;
			
		}
		
	}

}
