
public class Prob3_22 {

	public static void main(String[] args) {
		int N = 1;
			System.out.println("N         N^2      N^3          N^4");
		while (N <= 5) {
			System.out.printf("%d         %d         %d         %d %n", N, N*N, N*N*N, N*N*N*N);
			N = N + 1;
		}
	}

}
