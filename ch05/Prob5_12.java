import java.security.*;

public class Prob5_12 {

	public static void main(String[] args) {
		SecureRandom randomnumbers = new SecureRandom();
		
			int n;
			// a)
			n = 2 +randomnumbers.nextInt(5);
			// uncomment the following assignments to test the ranges
			
			// b)
//			n = 4 +randomnumbers.nextInt(47);
			
			// c)
//			n = 1 +randomnumbers.nextInt(7);
			
			// d)
//			n = 1000 + randomnumbers.nextInt(31);
			
			// e)
//			n = 1 - randomnumbers.nextInt(7);
			
			// f)
//			n =  randomnumbers.nextInt(12) - 2;
			
			System.out.println(n);		
	}

}
