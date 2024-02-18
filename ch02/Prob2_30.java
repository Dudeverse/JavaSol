import java.util.Scanner;

public class Prob2_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter 1st number: ");
		int n1 = input.nextInt();
		
		int first_dig = n1/10000;
		int rem1 = n1%10000;
		System.out.printf("First digit is %d%n", first_dig);
		
		int second_dig = rem1/1000;
		int rem2 = rem1%1000;
		System.out.printf("second digit is %d%n", second_dig);
		
		int third_dig = rem2/100;
		int rem3 = rem2%100;
		System.out.printf("third digit is %d%n", third_dig);
		
		int fourth_dig = rem3/10;
		int rem4 = rem3%10;
		System.out.printf("fourth digit is %d%n", fourth_dig);

		int fifth_dig = rem4/1;
		int rem5 = rem4%1;
		System.out.printf("last digit is %d%n", fifth_dig);
		

		System.out.printf("%d   %d   %d   %d   %d%n", first_dig, second_dig, third_dig, fourth_dig, fifth_dig);
	}

}
