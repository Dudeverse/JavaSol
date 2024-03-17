
public class Prob6_2dArrays {

	public static void main(String[] args) {
		int[][] nice = {{1,2,3,4,5}, {6,7,8,9,10}};
		
		System.out.println("Values in array1 by row are");
		outputArray(nice);
	}
	
	public static void outputArray(int[][] array) {
		for (int row = 0; row<array.length; row++) {
			for(int column = 0; column<array[row].length; column++) {
				System.out.printf("%d ", array[row][column]);
			}
			System.out.println();
		}
	}
}
