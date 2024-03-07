import java.util.Scanner;

public class Prob5_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String wow = input.nextLine();
		
		
		beautifyString(wow);
	}// end of main
	
	public static void beautifyString(String wow) {
		char caps = Character.toUpperCase(wow.charAt(0));
		System.out.print(caps);
		for (int i =1; i<wow.length(); i++) {
			System.out.printf("%s",wow.charAt(i));
		}
		if (wow.charAt(wow.length() - 1)!='.' ) {
			System.out.print(".");
		}
		
	}// end of beautifyString
	
	

	
}// end of class
