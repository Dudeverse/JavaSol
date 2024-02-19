// Problem 3.37 (Distance between two points)
// A program that takes input as coordinates of two points and lets us know if they lie on a line perpendicular to an axis.

import java.util.Scanner;

public class Prob3_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x co-ordinate of point 1: ");
		int x1 = input.nextInt();
		
		System.out.print("Enter y co-ordinate of point 1: ");
		int y1 = input.nextInt();
		
		System.out.print("Enter x co-ordinate of point 2: ");
		int x2 = input.nextInt();
		
		System.out.print("Enter y co-ordinate of point 2: ");
		int y2 = input.nextInt();
		
		if (x1==x2) {
			System.out.println("points are on a line perpendicular to x-axis");
		} else if (y1==y2){
			System.out.println("points are on a line perpendicular to y-axis");
		} else {
			System.out.println("points are on a line neither perpendicular to x nor y axes.");
		}

	}

}
