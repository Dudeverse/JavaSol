
public class Prob3_33 {

	public static void main(String[] args) {
		int rows = 0;
		int cols = 0;
		
		while (rows < 8) {
			
			if (rows%2==0) {
				while (cols < 8) {
					System.out.print("* ");
					cols +=1;
				}
			} else {
				System.out.print(" ");
				while (cols < 8) {
					System.out.print("* ");
					cols +=1;
				}
			}
			
			System.out.println();
			rows+=1;
			cols = 0;
	}	

}
	
}
