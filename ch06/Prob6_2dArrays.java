
public class Prob6_2dArrays {

	public static void main(String[] args) {
		int[][] array1 = {{1,2,3},{4,5,6}};
		int[][] array2 = {{3,3} ,{3}, {3,3,3}};
		
		System.out.println("Values in array1 by row are: ");
		outputArray(array1);
		
		System.out.printf("%nValues in array2 by row are: %n");
		outputArray(array2);
		
	}
	
	public static void outputArray(int[][] array) {
		int total = 0;
		for (int row = 0; row <array.length; row++) {
			for (int col = 0; col <array[row].length; col++) {
				
				if (row==1) {
					array[row][col] =0;
				}else {
					total = total + array[row][col]; 
				}
				System.out.printf("%d ",array[row][col]);
			}	
			System.out.println();
		}
		System.out.printf("sum of all elements in array is: %d%n",total);
	}
}
