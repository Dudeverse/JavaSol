import java.util.Scanner;

public class Prob4_11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of numbers you want to input: ");
		int num = input.nextInt();
		int max = 1;
		int min = 0;
		
		

		
		for (int i = 1;i <= num; i++ ) {
			System.out.printf("Enter number - %d: ", i);
			int temp = input.nextInt();
			
			if (i == 1) {
				max = temp;
				min = temp;
			}
			
			if (i > 1) {
				if (temp > max) {
					max =temp;
				} else if (temp < min) {
					min = temp;
				}
			}

		}
		
		System.out.printf("Least of the numbers: %d%n", min);
		System.out.printf("Maximum of the numbers: %d", max);

		
		
		
		
		
	}

}
