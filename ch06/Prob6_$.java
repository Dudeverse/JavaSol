// Restarting chapter-6 this time fr fr
// finished 6.1
public class Prob6_$ {

	public static void main(String[] args) {
		System.out.println("Example-1"); // column headings
		int[] c = new int[10]; // create array c
		
		System.out.printf("%s%8s%n", "Index", "Value"); // column headings
		
		// output each array element's value
		for (int counter = 0; counter <c.length; counter++) {
			System.out.printf("%5d%8d%n", counter, c[counter]);
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Example-2");
		// using array initializer (sounds like an action film title)
		int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		
		System.out.printf("%s%8s%n", "Index", "Value"); // column headings
		
		// output each array element's value
		for (int counter = 0; counter <array.length; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
		
		
	}
		
}
