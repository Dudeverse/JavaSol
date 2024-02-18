import java.util.Scanner;

public class Prob2_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		int n1 = input.nextInt();
		
		System.out.print("Enter 2nd number: ");
		int n2 = input.nextInt();
		
		System.out.print("Enter 3rd number: ");
		int n3 = input.nextInt();
		
		System.out.print("Enter 4th number: ");
		int n4 = input.nextInt();
		
		System.out.print("Enter 5th number: ");
		int n5 = input.nextInt();
		
		int count_neg = 0;
		int count_pos = 0;
		int count_zero = 0;
		
		if (n1 < 0) {
			count_neg = count_neg + 1;
		}
		if (n1 == 0) {
			count_zero = count_zero + 1;
		}
		if (n1 > 0) {
			count_pos = count_pos + 1;
		}
		
		if (n2 < 0) {
			count_neg = count_neg + 1;
		}
		if (n2 == 0) {
			count_zero = count_zero + 1;
		}
		if (n2 > 0) {
			count_pos = count_pos + 1;
		}
		
		if (n3 < 0) {
			count_neg = count_neg + 1;
		}
		if (n3 == 0) {
			count_zero = count_zero + 1;
		}
		if (n3 > 0) {
			count_pos = count_pos + 1;
		}
		
		if (n4 < 0) {
			count_neg = count_neg + 1;
		}
		if (n4 == 0) {
			count_zero = count_zero + 1;
		}
		if (n4 > 0) {
			count_pos = count_pos + 1;
		}
		
		if (n5 < 0) {
			count_neg = count_neg + 1;
		}
		if (n5 == 0) {
			count_zero = count_zero + 1;
		}
		if (n5 > 0) {
			count_pos = count_pos + 1;
		}
		
		System.out.printf("Number of positives: %d%n", count_pos);
		System.out.printf("Number of negatives: %d%n", count_neg);
		System.out.printf("Number of zeroes: %d%n", count_zero);

	}

}
