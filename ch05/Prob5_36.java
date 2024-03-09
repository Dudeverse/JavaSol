// Making a difference - Computer Assisted Instruction 5.36
import java.security.*;
import java.util.Scanner;

public class Prob5_36 {

	public static void main(String[] args) {
		int user_answer;
		int correct_answer;
		correct_answer = generateQuestion();
		
		do {
			Scanner input = new Scanner(System.in);
			user_answer = input.nextInt();
			
			if (user_answer==correct_answer) {
				//System.out.println("Yay! You got that right!");
				issuePositiveResponse();
				System.out.println();
				correct_answer = generateQuestion();// generate a new question if answer is correct
			} else {
				//System.out.println("oops! :(");
				issueNegativeResponse();
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
	
	public static void issuePositiveResponse() {
		SecureRandom rand_num = new SecureRandom();
		
		int num = 1 + rand_num.nextInt(6);
		
		switch(num) {
		case 1:
			System.out.println("Woohoo! Good job!");
			break;
		case 2:
			System.out.println("Excellent!");
			break;
		case 3:
			System.out.println("Nice work!");
			break;
		case 4:
			System.out.println("Well done!");
			break;
		case 5:
			System.out.println("Keep up the good work!");
			break;
		default:
			System.out.println("Yay! You got that right!");
			break;
		}
	} // end of issuePositiveResponse
	
	public static void issueNegativeResponse() {
		SecureRandom rand_num = new SecureRandom();
		
		int num = 1 + rand_num.nextInt(6);
		
		switch(num) {
		case 1:
			System.out.println("No. Please try again.");
			break;
		case 2:
			System.out.println("Wrong. Try once more.");
			break;
		case 3:
			System.out.println("Oops! Try again!");
			break;
		case 4:
			System.out.println("Don't give up!");
			break;
		case 5:
			System.out.println("No. Keep trying.");
			break;
		default:
			System.out.println("Wrong. Come on, you got this.");
			break;
		}
	}// end of issueNegativeResponse
		
	
}
// end of classBody
