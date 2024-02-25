
public class Prob4_23 {

	public static void main(String[] args) {
	int x = 1;
	int y = 1;
	int a = 1;
	int b = 1;
	int g = 1;
	int i = 5;
	int j = 6;
	// (a), (b), (c), (d) refer to the questions 4.23a,b,c,d .
	if (( !(x < 5) && !(y >= 7) ) == ( !(x < 5 || y >= 7) ) ){
		System.out.println("(a) is valid");
	}
	
	if (  !(a == b) || !(g != 5)  ==  !(a == b && g != 5 ) ) {
		System.out.println("(b) is valid");

	}
	
	if (   !( (x <= 8) && (y > 4) )  ==  (!(x <= 8) || !(y > 4) ) ) {
		System.out.println("(c) is valid");

	}
	
	if (   !(   (i > 4)||(j <= 6)  )==(   !(i>4)&&!(j <= 6)   )    ) {
		

		System.out.println("(d) is valid");

	}
	
	}

}
