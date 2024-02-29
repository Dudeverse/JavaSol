// An application to print the Twelve Days of Christmas Song
public class Prob4_29 {

	public static void main(String[] args) {
		int day =1;
		int verse_num = 1;
		String day_placeholder = "";
		String verse = "";
		
		
		for (day = 1; day <=12; day++) {
			switch (day) {
			case 1:
				day_placeholder = "first";
				break;
			case 2:
				day_placeholder = "second";
				break;
			case 3:
				day_placeholder = "third";
				break;
			case 4:
				day_placeholder = "fourth";
				break;
			case 5:
				day_placeholder = "fifth";
				break;
			case 6:
				day_placeholder = "sixth";
				break;
			case 7:
				day_placeholder = "seventh";
				break;
			case 8:
				day_placeholder = "eighth";
				break;
			case 9:
				day_placeholder = "ninth";
				break;
			case 10:
				day_placeholder = "tenth";
				break;
			case 11:
				day_placeholder = "eleventh";
				break;
			case 12:
				day_placeholder = "twelfth";
				break;
			}//end of first switch case
			System.out.printf("On the %s day of christmas, my true love sent me %n", day_placeholder );

			
			for (verse_num =day; verse_num>=1; verse_num--) {
				switch (verse_num) {
				case 1:
					if (day==1) {// on first day
						verse = "A partridge in a pear tree.";
					} else {// on other days, include the conjunction "And"
						verse = "And a partridge in a pear tree.";
					}
					
					break;
				case 2:
					verse = "Two turtle doves,";
					break;
				case 3:
					verse = "Three French hens,";
					break;
				case 4:
					verse = "Four calling birds,";
					break;
				case 5:
					verse = "Five gold rings,";
					break;
				case 6:
					verse = "Six geese a-laying,";
					break;
				case 7:
					verse = "Seven swans a-swimming,";
					break;
				case 8:
					verse = "Eight maids a-milking,";
					break;
				case 9:
					verse = "Nine ladies dancing,";
					break;
				case 10:
					verse = "Ten lords a-leaping,";
					break;
				case 11:
					verse = "Eleven pipers piping,";
					break;
				case 12:
					verse = "Twelve drummers drumming,";
					break;
				}//end of second switch case
				System.out.printf("%s%n", verse );
			}
			
			System.out.println();
			
			
			

		}
				
	}//end of main

}// end of class
