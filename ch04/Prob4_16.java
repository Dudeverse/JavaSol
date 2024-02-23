import java.util.Scanner;

public class Prob4_16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		int num5=0;
		
		
		for (int counter = 1; counter <=5; counter++) {
			
			System.out.printf("Enter number - %d (must be between 1 and 30): ", counter);
			
			int number = input.nextInt();
			
			if (number>=1 && number <= 30) {
				switch (counter) {
					case 1: 
						num1 = number;
						break;
					case 2:
						num2 = number;
						break;
					case 3:
						num3 = number;
						break;
					case 4:
						num4 = number;
						break;
					case 5:
						num5 = number;
						break;
				}
			} else {
				System.out.print("Please enter number within the specified range.\n");
				counter--;
			}
		}
		System.out.println();
		int value = 0;
		
		for (int counter2 = 1; counter2 <=5; counter2++) {
			
			switch(counter2) {
			case 1:
				value = num1;
				break;
			case 2:
				value = num2;
				break;
			case 3:
				value = num3;
				break;
			case 4:
				value = num4;
				break;
			case 5:
				value = num5;
				break;
			}
			
			for (int i = 1; i <= value; i++) {
				System.out.print("*");
			}
			System.out.println();

			
		}
		
	}

}
