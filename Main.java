/*Program to find perfect numbers between 1 and 200
   A perfect number is a positive integer that is equal to the sum of its proper positive divisors, excluding the number itself. 
   For example, 6 is a perfect number because its divisors are 1, 2, and 3, and 1 + 2 + 3 = 6.  
 */
public class Main {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 200; i++) {
            int total = 0;

            // loop to find and add up divisors
          for (int j = 1; j < i; j++) {
            
              // check divisors
              if (i % j == 0) {
                
                // total divisors
                total += j;
              }
            }
            if (total == i) {
                System.out.println(i + " is a perfect number.");
            }
        }

        User user = new User();
        user.UserPrompt();
    }
}

        