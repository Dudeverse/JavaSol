// Distance Between Point

import java.util.Scanner;

public class Prob5_32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x1 co-ordinate: ");
		double x1 = input.nextDouble();
		
		System.out.print("Enter y1 co-ordinate: ");
		double y1 = input.nextDouble();
		
		System.out.print("Enter x2 co-ordinate: ");
		double x2 = input.nextDouble();
		
		System.out.print("Enter y2 co-ordinate: ");
		double y2 = input.nextDouble();
		
		System.out.printf("Distance between (x1, y1) and (x2, y2) is %f", distance(x1,y1,x2,y2));
	}
	
	public static double distance(double x1,double y1,double x2,double y2) {
		return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	}
}
