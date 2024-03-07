import java.util.*;
public class Prob5_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1 = 0;
		
		while(num1!=-1) {
			System.out.print("Enter 1st number or -1 to quit: ");
			 num1 = input.nextInt();
			 if (num1 == -1) {
				 System.out.println("Job quit.");
			 }
			
			if (num1>-1) {
				System.out.print("Enter 2nd number: ");
				int num2 = input.nextInt();
				
				System.out.printf("Is second number a multiple of the first one?: %b %n", isMultiple(num1,num2));

			}

		}
		
	}
	public static boolean isMultiple(int num1, int num2) {
		return (num2%num1==0);
	}

}
