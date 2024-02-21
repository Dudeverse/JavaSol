// Sales Commission Calculator

import java.util.Scanner;

public class Prob3_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int item = 1;
		float price = 0;
		float sales_So_Far = 0;
		float commission = 0;
		
		while (item > 0) {
			System.out.print("Enter item value or -1 to quit:");
			price = input.nextFloat();
			
			if (price == -1) {
				item = -1;
			} else if (price > 0) {
				sales_So_Far += price;
				commission = 200 + ((float) (9)/(100) * sales_So_Far);

			} else if (price < -1) {
				System.out.print("Please Enter a valid item value!\n");
				item = 1;

			}
			

		}
		if (commission ==0) {
			System.out.println("No sales were made.");
		} else {
			System.out.printf("sales commission: %.2f", commission);

		}
		
	}

}
