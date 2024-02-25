
public class Prob4_21 {

	public static void main(String[] args) {
		for (int side1 = 1; side1 <=500; side1++) {
			for (int side2 = 1; side2 <= 500; side2++) {
				for (int hypotenuse = 2; hypotenuse <=500; hypotenuse++) {
					if ((side1*side1) + (side2*side2) == (hypotenuse*hypotenuse)) {
						System.out.printf("Pythogorean triplets are: %d %d %d%n", side1, side2, hypotenuse);
					}
				}
			}
		}
	}

}
