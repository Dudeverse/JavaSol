import java.security.SecureRandom;

public class Prob5_13 {

	public static void main(String[] args) {
		SecureRandom rand_num = new SecureRandom();
			// a)
			int x = 3 * rand_num.nextInt(5);
			
			//uncomment to test other ranges:
			// b)
			//int x = (int) Math.pow(2,rand_num.nextInt(6));
			
			// c)
			//int x = 10 + 10*rand_num.nextInt(4);
			System.out.println(x);
		
		
	}

}
