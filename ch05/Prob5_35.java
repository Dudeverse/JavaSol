// Making a difference - Computer Assisted Instruction
import java.security.*;
import java.util.Scanner;

public class Prob5_35 {

	public static void main(String[] args) {
		int user_answer;
		int correct_answer;
		correct_answer = generateQuestion();
		
		do {
			Scanner input = new Scanner(System.in);
			user_answer = input.nextInt();
			
			if (user_answer==correct_answer) {
				System.out.println("Yay! You got that right!");
				System.out.println();
				correct_answer = generateQuestion();// generate a new question if answer is correct
			} else {
				System.out.println("oops! :(");
				System.out.print("Answer  : ");
			}
		} while (user_answer!=correct_answer);
		}// end of main
		
	
	
	public static int generateQuestion() {
		SecureRandom rand_num = new SecureRandom();
		
		int num1 = 1 + rand_num.nextInt(9);
		int num2 = 1 + rand_num.nextInt(9);
		int product = num1 * num2;
		
		System.out.printf("Question: How much is %d times %d?%n", num1, num2);
		System.out.print("Answer  : ");
		return product;
	}
		
}
// end of classBody
