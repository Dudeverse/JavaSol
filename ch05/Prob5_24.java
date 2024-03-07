import java.util.Scanner;

public class Prob5_24 {

	public static void main(String[] args) {
		for (int count = 1; count <= 1000; count++) {
			if (isPerfect(count)==true) {
				System.out.printf("%d is a perfect number%n", count);
				System.out.print("The factors are: ");
				PerfectNumbers(count);
				System.out.println();
				System.out.println();
			};
			
			
		}
	}
	
	// to determine if it's perfect
	public static boolean isPerfect(int num) {
		int sum_So_far = 0;
		for (int i=1; i<num; i++) {
			if (num%i==0) {
				sum_So_far += i;
			}
		}
		if (num==sum_So_far) {
			return true;
		} else {
			return false;
		}
	
	}
	
	// to print the factors
	public static void PerfectNumbers(int num) {
		int sum_So_far = 0;
		for (int i=1; i<num; i++) {
			if (num%i==0) {
				System.out.printf("%d ",i);
				sum_So_far += i;
			}
		}
	}
	
}
