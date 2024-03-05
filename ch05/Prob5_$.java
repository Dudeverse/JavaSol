
public class Prob5_$ {

	public static void main(String[] args) {
		// TODO PLAYGROUND FOR PROBLEMS OF CHAPTER 5
		//Section 5.3 small example
		
		//Another example
		double c = 13.0;
		double d = 5.0;
		double f = 4.0;
		double n = -9.5;
		// "HIGH PRECISION"value of pi
		System.out.println(Math.PI);
		// "HIGH PRECISION" value of E
		System.out.println(Math.E);
		System.out.println(Math.sqrt(900.00));
		System.out.println(Math.sqrt(c + d * f));
		System.out.println(Math.abs(n));
		System.out.println(Math.ceil(n));
		System.out.println(Math.ceil(f));
		System.out.println(Math.ceil(d));
		System.out.println(Math.exp(d));
		System.out.println(Math.floor(n));
		System.out.println(Math.log(Math.E));
		System.out.println(Math.max(c, n));
		System.out.println(Math.min(c, n));
		System.out.println(Math.pow(d, f));
		System.out.println(Math.sin(d));
		System.out.println(Math.sqrt(Math.pow(d, f)));
		System.out.println(Math.tan(d));
		System.out.println(Math.max(-19.9, -21.1));
		System.out.println("Holy" + " Roller!");
		System.out.println("Concatenated Value of c + d is: " + c + d);
		System.out.println("Sum value of c + d is : " + (c + d));
		System.out.println("Sum value of 2(c + d) is : " + 2*(c + d));
		
		// method overloading
		System.out.printf("Square of integer 7 is %d%n",   square(80)    );
		System.out.printf("Square of double 7.5 is %f%n",  square(7.5)          );
			 
		
		
		
		

	}
	
	public static int square(int intValue) {
		System.out.printf("%nCalled square with int argument: %d%n",intValue);
		return intValue * intValue;
	}
	
	public static double square(double doubleValue) {
		System.out.printf("%nCalled square with double argument: %.3f%n",doubleValue);
		return doubleValue * doubleValue;
	}

	
}
