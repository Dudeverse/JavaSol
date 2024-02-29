// using a structured equivalent to replace continue statements
public class Prob4_28 {

	public static void main(String[] args) {
		for (int count=1; count<=10;count++) {
			if (count==5) {
				//continue;  continue is used to skip when count is 5, right?
				//           If we want to get out of the loop, we just need
				//           to increase the count value to 5. We can set it to 6, 
				//           or simply increment it using ++.
				count++;
			}
			System.out.printf("count: %d%n", count);
		}
		System.out.println("Used increment to skip 5");
	}

}
