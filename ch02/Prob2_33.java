import java.util.Scanner;

public class Prob2_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Weight in kilograms: ");
		float Weight = input.nextFloat();
		
		System.out.print("Height in metres: ");
		float Height = input.nextFloat();
		
		float BMI = Weight/ (Height*Height);
		System.out.printf("BMI is: %f%n", BMI);
		
		if (BMI > 30) {
			System.out.println("You are obese.");
		}
		
		if (BMI <= 18.5) {
			System.out.println("You are underweight.");
		}
		
		if (BMI >= 25) {
			if (BMI < 29.9) {
				System.out.println("You are overweight.");
			}
		}
		
		if (BMI > 18.5) {
			if(BMI <= 24.9) {
				System.out.println("You are of normal weight");
			}
		}
	}

}
