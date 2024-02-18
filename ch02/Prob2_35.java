import java.util.Scanner;

public class Prob2_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Estimated number of stones: ");
		int num_stones = input.nextInt();
		
		System.out.print("Average weight of each stone: ");
		int avg_wt = input.nextInt();
		
		System.out.print("Number of years it took to build the pyramid: ");
		int num_years = input.nextInt();
		
		System.out.printf("%d kg of pyramid was built in an year%n", (num_stones*avg_wt)/(num_years));	
		System.out.printf("%d kg of pyramid was built in an hour%n", (num_stones*avg_wt)/(num_years * 365 * 24));		
		System.out.printf("%d kg of pyramid was built in an minute%n", (num_stones*avg_wt)/(num_years * 365 * 24 * 60));		
		
		
	}

}
