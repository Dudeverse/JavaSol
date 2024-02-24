import java.util.Scanner;

public class Prob4_20 {

	public static void main(String[] args) {
		int numerator = 4;
		int denominator = 1;
		double frac = 0;
		double pi_val = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number of terms to be calculated: ");
		int num_of_terms = input.nextInt();
		
		for (int i = 0; i<num_of_terms; i++ ) {
			if (i%2==0) {
				denominator = 2*i + 1;
			} else {
				denominator = -(2*i + 1);
			}
			
			frac = (double) numerator/denominator;
			pi_val += frac;
			System.out.printf("num_of_terms so far: %d%n",i+1);
			System.out.printf("pi value so far: %.9f%n",pi_val);

			
					
			
		}
		System.out.printf("pi value: %.9f%n",pi_val);
	}

}
