import java.util.Scanner;

public class Prob5_19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a side(an integer > 0): ");
		int side = input.nextInt();
		
		// Hmmm, this is new.
		System.out.print("Enter a character($,%,&,#,@): ");
		char fillCharacter = input.next().charAt(0);
		
		squareOfAsterisks(side, fillCharacter);

	}
	
	public static void squareOfAsterisks(int side, char fillChar  ) {
		for (int i = 1; i<=side; i++) {
			for (int k = 1; k<=side; k++) {
				System.out.printf("%s", fillChar);
				
			}System.out.println();
		}
	}
	
}
