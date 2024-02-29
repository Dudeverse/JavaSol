// using a structured equivalent to replace break statement

public class Prob4_26 {

	public static void main(String[] args) {
		int count;
		
		for (count =1; count<5 && count<=10;count++) {// another way to implement break condition
//			if (count==5) {
//				break;
//			}
			System.out.printf("count: %d%n",count);
			
		}
		System.out.printf("Early exit because of a break condition: %d%n",count);
	}

}
