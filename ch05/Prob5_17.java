import java.util.Scanner;
public class Prob5_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = 0;
		
		while(num1!=-1) {
			System.out.print("Enter a number or -1 to quit: ");
			 num1 = input.nextInt();
			 if (num1 == -1) {
				 System.out.println("Job quit.");
			 }
			
			if (num1!=-1) {
				System.out.printf("Is the number a divisible by 5?: %b %n", isDivisible(num1));

			}

		}
		
	}
	public static boolean isDivisible(int num1) {
		return (num1%5==0);
	}

}
