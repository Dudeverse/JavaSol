public class Prob4_14 {
	
   public static void main(String[] args) {
      double principal = 1000.0; // initial amount before interest
      double rate = 0.05; // interest rate
      
      for (int i = 5; i < 11; i++ ) {
    	  rate = (double) i / 100;
    	  
	      // display headers
	      System.out.printf("%s%20s%n", "Year", "Amount on deposit");
	
	      // calculate amount on deposit for each of ten years
	      for (int year = 1; year <= 10; ++year) {                  
	         // calculate new amount on deposit for specified year  
	         double amount = principal * Math.pow(1.0 + rate, year);
	                                                                
	         // display the year and the amount                     
	         System.out.printf("%4d%,20.2f%n", year, amount);       
	      }     
	      
      }
   } 
} 