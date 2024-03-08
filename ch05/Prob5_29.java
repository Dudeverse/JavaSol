import java.util.Scanner;
import java.security.*;
public class Prob5_29 {
	
	private static final SecureRandom rand_num = new SecureRandom();
	
	private enum Coin { HEADS, TAILS };
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of times you want to toss the coin: ");
		int counter = input.nextInt();
		String res = "";
		int head_Count = 0;
		int tail_Count = 0;
		Coin result;
		
		for (int i = 1; i <= counter; i++) {
			flip();
			if (flip()==1) {
				result = Coin.HEADS;
				res = "HEADS";
				head_Count++;
				
			} else {
				result = Coin.TAILS;
				res = "TAILS";
				tail_Count++;
			}
			System.out.printf("Toss Number-%d  Result: %s %n",i, res);
			
		}
		System.out.printf("Number of heads: %d Number of Tails: %d", head_Count, tail_Count);
		
		
		
	}// end of main
	
	public static int flip() {
		int toss = rand_num.nextInt(2);
		return toss;
	}// end of flip

}
