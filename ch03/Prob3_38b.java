import java.util.Scanner;

public class Prob3_38b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of terms: ");
		int num = input.nextInt();
		int inner_count = num-1;
		int outer_count = num-1;
		int product_So_far = num-1;
		int a = num-1;
		int b = a - 1;
		
		double denominator = 1;
		double e = 0;
		
		if (num == 0) {
			System.out.println("Value of e is 0");
		} else if (num == 1) {
			System.out.println("Value of e is 1");
		} else if (num == 2) {
			System.out.println("Value of e is 2");
		} else if (num == 3) {
			System.out.println("Value of e is 2.5");
		} else {
			e = 2.5;
			while (outer_count > 2) {
				System.out.printf("##################################################count in outer loop is: %d%n",outer_count);
				
				// ################### this block calculates factorial ######################
				while (inner_count>1) {
					System.out.printf("###################count in inner loop is: %d%n",inner_count);

					product_So_far = a * b;
					b = b - 1;
					a = product_So_far;
					inner_count = inner_count - 1;
					System.out.printf("factorial inside loop is: %d%n",product_So_far);

				}
				System.out.printf("factorial is: %d%n",product_So_far);
				// ################### this block calculates factorial ######################
				denominator = product_So_far;
				e = e + 1/denominator;
				System.out.printf("------------------- e value so far is %.9f%n",e);

				outer_count = outer_count - 1;
				inner_count = outer_count;
				product_So_far = outer_count;
				a = outer_count;
				b = a - 1;

			}
			System.out.printf("Value of e is %.9f%n",e);
		}
	}

}
