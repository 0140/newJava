package demo;


/**
 * Amex
 * 
 * @author Bhaskara Sama
 *
 */
public class FizzBuzz {
    public static void main(String[] args) {
        /*for (int i = 1; i < 101; i++) {
            // Set this to true when one of the special conditions is met.
             
*/            
    	    int i = 30;
    	    boolean printed = false; 
            if (i % 3 == 0 && !(i % 5 == 0)) {
                // When i is divisible by 3, then print "Fizz"
                //printed = true;
                System.out.print("Fizz");
            } else if (i % 5 == 0 && !(i % 3 == 0)) {
                // When i is not divisible by 3 but is divisible by 5, then print "Buzz"
                //printed = true;
                System.out.print("Buzz");
            } else    if (   (i % 3 == 0)  &&    (i % 5 == 0)    )
            {
            	//printed = true;
                System.out.print("FizzBuzz");
                //continue;
            	
            } else {
                System.out.print(i);

            }

            
        //}
        
    }
}