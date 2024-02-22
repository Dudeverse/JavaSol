
public class Prob4_13 {

	public static void main(String[] args) {
		long sum = 0;
		for (int counter1 = 1;counter1 <= 100;counter1++) {
			sum = 0;
			for (int counter2 = 1;counter2 <=counter1;counter2++) {
				sum = sum + counter2;	
			}
			System.out.printf("sumuct of first %d numbers: %d%n",counter1, sum);
		}
		
		
		
		
	}

}
