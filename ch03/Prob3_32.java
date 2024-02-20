import java.util.Scanner;

public class Prob3_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int binary;
		int bit;
		int decimal;
		
		bit = 1;
		decimal = 0;
		
		System.out.print("Enter a binary number: ");
		binary = input.nextInt();
		
		while (binary!=0) {
			
			System.out.printf("---------------------Loop begin-----------------------\n");

			decimal = decimal + binary%10 * bit;
			System.out.printf("Decimal at this stage: %d%n",decimal);
			binary = binary/10;
			System.out.printf("binary at this stage: %d%n",binary);
			bit = bit * 2;
			System.out.printf("bit at this stage: %d%n",bit);
			
			System.out.printf("---------------------Loop end-----------------------\n");


			
		}
		
		System.out.printf("Decimal is %d", decimal);
		


		
		
	}

}
