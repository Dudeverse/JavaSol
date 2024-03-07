import java.util.Scanner;

public class Prob5_20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.printf("Is %d a leap year?: %b",year, isLeapYear(year));
	}
	public static boolean isLeapYear(int year) {
		return (year%4==0);
	}

}
