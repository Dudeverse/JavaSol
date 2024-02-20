import java.util.Scanner;
public class Prob3_24 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// initializing variables in declarations
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;
		
		while (studentCounter <= 10) {
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			int result = input.nextInt(); 
			
			if (result == 1) {
				 passes = passes + 1;
			}
			else if (result == 2) {
				 failures = failures + 1;
			}
			else {
				System.out.print("Enter a valid result please!\n");
				studentCounter = studentCounter - 1;
				
			}
			
			studentCounter = studentCounter + 1; 
			
		}
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		// determine whether more than 8 students passed
		if (passes > 8) {
		 System.out.println("Bonus to instructor!");
		}
		
	}

}
