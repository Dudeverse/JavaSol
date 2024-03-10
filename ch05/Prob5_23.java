import java.util.Scanner;

public class Prob5_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        if(isPalindrome(number)) {
            System.out.printf("%d is a palindrome.%n", number);
        } else {
            System.out.printf("%d is not a palindrome.", number);
        }
        
        
    }
    
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        
        while(number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        
        return originalNumber == reversedNumber;
    }
}
