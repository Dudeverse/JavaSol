import java.util.Scanner;

public class Prob5_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		double x = input.nextDouble();
		
		double y = Math.floor(x + 0.5);
		int z = (int) y;
		
		
		System.out.printf("%f is rounded to %d", x,z);
			
	}

}
