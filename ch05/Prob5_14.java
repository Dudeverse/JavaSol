import java.util.Scanner;

public class Prob5_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a decimal number: ");
		double num1 = input.nextDouble();
		System.out.printf("ceiling value of %f is %d%n", num1, myCeil(num1));
		System.out.printf("floor value of   %f is %d%n", num1, myFloor(num1));

	}
	
	public static int  myFloor(double num) {
		int floor = (int) num;
		return floor;
	}
	
	public static int  myCeil(double num) {
		if (num != (int) num) {
			int ceil = (int) num + 1;
			return ceil;
		} else {
			return (int) num;
		}
	}
}
