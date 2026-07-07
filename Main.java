import java.util.Scanner;

/*
Create a Java project in IDE and begin the Project Program by writing a multi-line comment at the top that describes the purpose and function of the program.
Create a class for Rectangle and the appropriate method to calculate area
You will write code to prompt the user to enter the dimensions, call the method and return a valid value
Be sure to check for input/output errors
*/
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

        System.out.println("Cylinder Volume Calculator");
            System.out.print("Enter the radius: ");
            double radius = input.nextDouble();

            System.out.print("Enter the height: ");
            double height = input.nextDouble();

            Cylinder cylinder = new Cylinder(radius, height);

            System.out.printf("Volume = %.2f%n", cylinder.getVolume());


        input.close();

    }
}




