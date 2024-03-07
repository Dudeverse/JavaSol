import java.util.Scanner;

public class Prob5_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of hours parked: ");
		double park_hours = input.nextDouble();
		double charge_accrued = calculateCharges(park_hours);
		System.out.printf("Please pay $%.2f. ", charge_accrued);
		
		
	}
	
	public static double calculateCharges(double park_time) {
		double base_fee = 2.00;
		double charge = 0;
		if (park_time <= 3) {
			charge = base_fee;
		} else if (park_time > 3 && park_time < 24) {
			double modified_time = Math.ceil(park_time);
			
			charge = base_fee + ((modified_time - 3) * 0.5);
		} else {
			charge = 10.0;
		}
		
		return charge;
	}

}
