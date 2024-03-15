// Restarting chapter-6 this time fr fr
// finished 6.1
public class Prob6_$ {

	public static void main(String[] args) {
		int[] c = new int[10]; // create array c
		
		System.out.printf("%s%8s%n", "Index", "Value"); // column headings
		
		// output each array element's value
		for (int counter = 0; counter <c.length; counter++) {
			System.out.printf("%5d%8d%n", counter, c[counter]);
		}
	}
}
