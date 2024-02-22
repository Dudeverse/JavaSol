
public class Prob4_12 {

	public static void main(String[] args) {
		int sum;
		sum = 0;
		for (int counter = 1; counter <30; counter++) {
			if (counter%3==0) {
				sum = sum + counter;
			}
		}
		System.out.printf("Sum of integers between 1 and 30 that are divisible by 3: %d", sum);
	}

}
