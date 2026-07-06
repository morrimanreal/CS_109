/*
Take user input of integer type
This value is the upper limit of the search for perfect numbers
Test out several scenarios of larger numbers: What happens if the number overflows the limits of the int data type?
Change the data type to allow larger numbers
*/
import java.util.Scanner;

public class User {
    
    Scanner scanner = new Scanner(System.in);
    
    void UserPrompt() {

        
        // Prompt the user for an integer input
        // input is the upper limit of the search for perfect numbers
        System.out.print("Please enter a number to search for perfect numbers up to: ");
        
        int upperLimit = scanner.nextInt();

        int total = 0;

        for (int i = 1; i <= upperLimit; i++) {
            total = 0;

            // loop to find and add up divisors
            for (int j = 1; j < i; j++) {
                
                // check divisors
                if (i % j == 0) {
                    
                    // total divisors
                    total += j;
                }
            }
            if (total == i) {
                System.out.println(total + " is a perfect number.");
            }
        }

        
    }
}
