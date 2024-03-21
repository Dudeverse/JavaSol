
public class Prob6_varArg {
	
	public static int maxi(int... numbers) {
		int actual_max = numbers[0];
		
		for (int i: numbers) {
			if (actual_max<i) {
				actual_max = i;
			}
		}
		return actual_max;
	}
	
	public static void main(String[] args) {
		int n1 = 2432;
		int n2 = 231;
		int n3 = 3999;
		int n4 = 19229;
		
		System.out.printf("Given integers:%nn1 = %d%nn2 = %d%nn3 = %d%nn4 = %d%n", n1,n2,n3,n4);
		
		System.out.printf("maximum of n1 and n2 is : %d%n", maxi(n1,n2));
		System.out.printf("maximum of n1 and n2 and n3 is : %d%n", maxi(n1,n2,n3));
		System.out.printf("maximum of n1 and n2 and n3 and n4 is : %d%n", maxi(n1,n2,n3,n4));


		
		
	}

}
