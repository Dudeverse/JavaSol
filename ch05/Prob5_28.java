import java.util.Scanner;

public class Prob5_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter today's temperature: ");
		double temp = input.nextDouble();
		sportsRecommender(temp);
	}
	
	public static void sportsRecommender(double temp) {
		if (temp>=20 && temp<=30) {
			System.out.println("It's lovely weather for sports today!");
		} else if ((temp >= 10 && temp<20) || (temp>30 && temp <=40)) {
			System.out.println("It’s reasonable weather for sports today.");
		} else {
			System.out.println("Please exercise with care today, watch out for the weather!	");
		}
	}

}
