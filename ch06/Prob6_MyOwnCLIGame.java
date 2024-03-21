
public class Prob6_MyOwnCLIGame {

	public static void main(String[] args) {
		if (args.length!=5) {
			System.out.println("Wow! An error!");
		}
		else {
			int n1 = Integer.parseInt(args[0]); 
			int n2 = Integer.parseInt(args[1]);
			int n3 = Integer.parseInt(args[2]); 
			int n4 = Integer.parseInt(args[3]);
			int n5 = Integer.parseInt(args[4]); 
			
			int sum = n1 + n2 + n3 + n4 + n5;
			System.out.printf("Sum: %d%n", sum);
		}
	}

}
