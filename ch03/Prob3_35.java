
public class Prob3_35 {

	public static void main(String[] args) {
		int x =5;
		x += x++ - 5;
		System.out.print(x);
		// first, x++ evaluates to 5
		// second, 5 - 5 = 0, the RHS evaluates to 0
		// third, x+=0 means x = x + 0, meaning RHS now evaluates to 5, and 5 is printed finally.

		
	}

}
