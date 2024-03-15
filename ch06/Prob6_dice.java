import java.security.*;

public class Prob6_dice {

	public static void main(String[] args) {
		SecureRandom rand = new SecureRandom();
		int[] frequency = new int[7];
		
		for(int roll=1; roll<=60; roll++) {
			++frequency[1 + rand.nextInt(6)];
		}
		
		for (int face=1; face<frequency.length; face++) {
			System.out.printf("face %d : %d times%n", face,frequency[face]);
		}
	}

}
