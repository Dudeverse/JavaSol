import java.util.Scanner;

public class Prob5_25 {

	public static void main(String[] args) {
		
		for (int count = 1; count <= 10000; count++) {
			if (isPrime(count)==true) {
				System.out.printf("%d is a prime number%n", count);
			} else {
				System.out.printf("%d%n", count);
			}
		}
		
		
		
	}//end of main
	
	public static boolean isPrime(int num) {
		if (num==1) {
			return false;
		}
		for (int i =2; i <=Math.sqrt(num); i++ ) {/* replace left operand with num/2 to test speed*/
				if (num%i==0) {
					return false;
				} 
			}
			return true;
		}//end of isprime
		
		
		
	}// end of class

