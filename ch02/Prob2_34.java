import java.util.Scanner;

public class Prob2_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter current population: ");
		float curr_pop = input.nextFloat();
		System.out.print("Enter growth rate: ");

		float growth_rate = input.nextFloat();
		
		float pop_1 = curr_pop + (growth_rate*curr_pop);
		System.out.printf("After one year, population will be: %f%n", pop_1 );
		
		float pop_2 = pop_1+ (growth_rate*pop_1);
		System.out.printf("After two years, population will be: %f%n", pop_2 );
		
		float pop_3 = pop_2+ (growth_rate*pop_2);
		System.out.printf("After two years, population will be: %f%n", pop_3 );
		
		float pop_4 = pop_3+ (growth_rate*pop_3);
		System.out.printf("After two years, population will be: %f%n", pop_4 );
		
		float pop_5 = pop_4+ (growth_rate*pop_4);
		System.out.printf("After two years, population will be: %f%n", pop_5 );
	}

}
