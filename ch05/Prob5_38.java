// Making a difference - Computer Assisted Instruction 5.37
import java.security.*;
import java.util.Scanner;

public class Prob5_38 {

	public static void main(String[] args) {
		startApp();
	}
	
	public static void startApp() {
		Scanner input = new Scanner(System.in);
		int user_answer;
		int correct_answer;
		int count_Right = 0;
		int total_Count = 0;
		
		System.out.println("Hello! Welcome to Computer Assisted Instruction!");
		System.out.print("Please enter a difficulty level (1 or 2): ");
		int response = input.nextInt();
		
		
		correct_answer=printQuestion(response);
		
		
		do {
			user_answer = input.nextInt();
			total_Count++;
			System.out.printf("Attempts so far : %d%n", total_Count);
			
			if (total_Count==10) {
				
				System.out.println("Assessment over! Thanks!\n");
				issueReport(count_Right, total_Count);
				
			} else if (user_answer==correct_answer) {
				
				count_Right++;
				issuePositiveResponse();
				System.out.println();
				correct_answer=printQuestion(response);// generate a new question if answer is correct
				
			} else {
				
				issueNegativeResponse();
				System.out.print("Answer  : ");
				
			}
		} while (user_answer!=correct_answer && total_Count <10); // generate report after 10 attempts
	}// end of startApp
	
	public static int generateQuestion() {
		SecureRandom rand_num = new SecureRandom();
		
		int num1 = 1 + rand_num.nextInt(9);
		int num2 = 1 + rand_num.nextInt(9);
		int product = num1 * num2;
		
		System.out.printf("Question: How much is %d times %d?%n", num1, num2);
		System.out.print("Answer  : ");
		return product;
	}
	
	public static int generateHardQuestion() {
		SecureRandom rand_num = new SecureRandom();
		
		int num1 = 1 + rand_num.nextInt(99);
		int num2 = 1 + rand_num.nextInt(99);
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
		
	public static void issueReport(int right, int total) {
		double score =   (double) right / (double) total;
		
		if (score > 0.7) { // for convenience, I changed the requirement from 0.75 to 0.7. Makes more sense when the limit is 10 questions
			System.out.println("Congrats! You can go to the next level!");
			System.out.println();
			System.out.println();
			System.out.println();
		} else {
			System.out.println("Please ask your teacher for extra help.");
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
		startApp(); // reset after assessment report is generated.
	}
	
	public static int printQuestion(int response) {
		int correct_answer;
		if (response==1) {
			correct_answer = generateQuestion();
		} else {
			correct_answer = generateHardQuestion();
		}
		return correct_answer;
	}
}
// end of classBody
