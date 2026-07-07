import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Creates a scanner to read keyboard input.
        Scanner input = new Scanner(System.in);

        // Prompt the user for dimensions
        System.out.print("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();
        
        // Create Rectangle object
        Rectangle rect = new Rectangle(length, width);
         
        // Display results
        rect.displayInfo();

        input.close();

    }
}




