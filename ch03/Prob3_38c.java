import java.util.Scanner;

public class Prob3_38c {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x value: ");
		int x = input.nextInt();
		
		System.out.print("Enter number of terms: ");
		int num = input.nextInt();
		
		// initialize variables to calculate numerator values
		int product = 1;
		int numerator = x;
		int temp = 0;
		double denominator = 1;
		double e = 0;
		
		// initialize variables to calculate denominator values
		int inner_count = num-1;
		int outer_count = num-1;
		int product_So_far = num-1;
		int a = num-1;
		int b = a - 1;
		
		
				
		if (num==0) {
			System.out.println("Value of e is 0");
			
	    }else if (num==1) {
			System.out.printf("Value of e is %d%n", 1);
			
		} else if (num==2) {
			
			System.out.printf("Value of e is %d%n", 1 + x);
			
		} else if (num==3){
			System.out.printf("Value of e is %.2f%n", 1 + x + (double)(x*x)/2);
		} else {
			
			e = 1 + x + (double)(x*x)/2;
			
			while (outer_count > 2) {
				System.out.printf("##################################################count in outer loop is: %d%n",outer_count);
				
				// ################### this block calculates numerator(power) ######################
				while (temp < outer_count) {
					product = product * numerator;
					temp = temp + 1;
				}
				System.out.printf("temp value is: %d%n",temp);
				numerator = product;
				System.out.printf("numerator is: %d%n",product);

				
				// ################### this block calculates numerator(power) ######################

				
				
				// ################### this block calculates denominator(factorial) ######################
				while (inner_count>1) {
					System.out.printf("###################count in inner loop is: %d%n",inner_count);
					product_So_far = a * b;
					b = b - 1;
					a = product_So_far;
					inner_count = inner_count - 1;
					System.out.printf("factorial inside loop is: %d%n",product_So_far);
					
				}
				System.out.printf("factorial is: %d%n",product_So_far);
				// ################### this block calculates denominator (factorial) ######################
				denominator = product_So_far;
				e = e + (double) numerator/denominator;
				System.out.printf("------------------- e value so far is %.9f%n",e);

				outer_count = outer_count - 1;
				inner_count = outer_count;
				product_So_far = outer_count;
				a = outer_count;
				b = a - 1;
				temp = 0;
				product = 1;
				numerator = x;

			}
			System.out.printf("e value is approximately %.9f%n",e);
		}
	}

}
