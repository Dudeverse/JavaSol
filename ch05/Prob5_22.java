import java.util.Scanner;

public class Prob5_22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Welcome to Celsius - Kelvin Converter!\nTo convert to Celsius, enter c\n To convert to Kelvin, enter k:");
		char conv = input.next().charAt(0);
		
		if (conv=='c') {
			
			System.out.print("Enter temperature in Kelvin: ");
			double kelvin = input.nextDouble();
			System.out.printf("Temperature in celsius is: %f",Celsius(kelvin));
			
		} else if (conv=='k'){
			
			System.out.print("Enter temperature in Celsius: ");
			double celsius = input.nextDouble();
			System.out.printf("Temperature in kelvin is: %f",Kelvin(celsius));

			
		}
		
		
	}// end of main
	
	public static double Celsius(double kelvin) {
		double celsius = kelvin - 273.15;
		return celsius;
	}
	
	public static double Kelvin(double celsius) {
		double kelvin = celsius + 273.15;
		return kelvin;
	}
	
	

}// end of class
