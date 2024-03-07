import java.util.Scanner;

public class Prob5_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a real number: ");
		double z = input.nextDouble();
		
		System.out.printf("%f rounded to the nearest integer is   : %d%n",z,roundToInteger(z));
		System.out.printf("%f rounded to the nearest tenth is     : %.2f%n",z,roundToTenths(z));
		System.out.printf("%f rounded to the nearest Hundredth is : %.3f%n",z,roundToHundredths(z));
		System.out.printf("%f rounded to the nearest Thousandth is: %.4f%n",z,roundToThousandths(z));

	}
	
	public static int roundToInteger(double x) {
		double y = Math.floor(x + 0.5);
		int i = (int) y;
		return i;
	}
	
	public static double roundToTenths(double x) {
		double y = Math.floor(x * 10 + 0.5) / 10;
		return y;
	}
	public static double roundToHundredths(double x) {
		double y = Math.floor(x * 100 + 0.5) / 100;
		return y;
	}
	public static double roundToThousandths(double x) {
		double y = Math.floor(x * 1000 + 0.5) / 1000;
		return y;
	}
}
