// Making a difference - Computer Assisted Instruction 5.39
import java.security.*;
import java.util.Scanner;

public class Prob5_39 {

	public static void main(String[] args) {
		startApp();
	}
	
	public static void startApp() {
	    Scanner input = new Scanner(System.in);
	    int user_answer;
	    int correct_answer;
	    int count_Right = 0;
	    int total_Count = 0;
	    String continueChoice="";

	    System.out.println("Hello! Welcome to Computer Assisted Instruction!");

	    do {
	        System.out.print("Please enter a difficulty level (1 or 2): ");
	        int response = input.nextInt();

	        System.out.print("Please enter Problem type:  (1 = Addition, 2 = Multiplication, 3 = Subtraction, 5 = Random): ");
	        int type = input.nextInt();

	        do {
	            correct_answer = printQuestion(response, type);

	            while (total_Count < 10) {
	                user_answer = input.nextInt();
	                total_Count++;
	                System.out.printf("Attempts so far : %d%n", total_Count);

	                if (user_answer == correct_answer) {
	                    count_Right++;
	                    issuePositiveResponse();
	                    System.out.println();
	                    if (total_Count<10) {
		                    correct_answer = printQuestion(response, type);// generate new question if answer is correct
	                    }
	                } else {
	                    issueNegativeResponse();
	                    System.out.print("Answer  : ");
	                }
	            }

	            if (total_Count == 10) {
	                System.out.println("Assessment over! Thanks!");
	                issueReport(count_Right, total_Count);

	                System.out.print("Do you want to continue? (y/n): ");
	                continueChoice = input.next();
	                if (!continueChoice.equalsIgnoreCase("y")) {
	                    break; // exit the inner loop if user does not want to continue
	                }

	                total_Count = 0;
	                count_Right = 0;
	            }
	        } while (total_Count == 10 && continueChoice.equalsIgnoreCase("y"));

	        if (!continueChoice.equalsIgnoreCase("y")) {
	            break; // exit the outer loop if user does not want to continue after the last assessment
	        }
	    } while (true); // loop indefinitely until user decides to stop
	}// end of startApp

	
	public static int generateQuestion(int type) {
		SecureRandom rand_num = new SecureRandom();
		int num1 = 1 + rand_num.nextInt(9);
		int num2 = 1 + rand_num.nextInt(9);
		int result = 0;
		
		if (type==5) {
			type = 1 + rand_num.nextInt(3);
		}
		
		switch(type) {
		case 1:
			result = num1+num2;
			System.out.printf("Question: How much is %d added to %d?%n", num1, num2);
			System.out.print("Answer  : ");
			break;
		case 2:
			result = num1*num2;
			System.out.printf("Question: How much is %d times %d?%n", num1, num2);
			System.out.print("Answer  : ");
			break;
		case 3:
			result = num1-num2;
			System.out.printf("Question: How much is %d - %d?%n", num1, num2);
			System.out.print("Answer  : ");
			break;
			
		}
		return result;
	}
	
	public static int generateHardQuestion(int type) {
		SecureRandom rand_num = new SecureRandom();
		int num1 = 1 + rand_num.nextInt(99);
		int num2 = 1 + rand_num.nextInt(99);
		int result = 0;
		
		if (type==5) {
			type = 1 + rand_num.nextInt(3);
		}
		
		switch(type) {
		case 1:
			result = num1+num2;
			System.out.printf("Question: How much is %d added to %d?%n", num1, num2);
			System.out.print("Answer  : ");
			break;
		case 2:
			result = num1*num2;
			System.out.printf("Question: How much is %d times %d?%n", num1, num2);
			System.out.print("Answer  : ");
			break;
		case 3:
			result = num1-num2;
			System.out.printf("Question: How much is %d - %d?%n", num1, num2);
			System.out.print("Answer  : ");
			break;
			
		}
		return result;
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
		
	}
	
	public static int printQuestion(int response, int type) {
		int correct_answer;
		if (response==1) {
			correct_answer = generateQuestion(type);
		} else {
			correct_answer = generateHardQuestion(type);
		}
		return correct_answer;
	}
}
// end of classBody

