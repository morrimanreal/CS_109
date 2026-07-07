public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
          if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be greater than zero.");
        }
        this.length = length;
        this.width = width;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    public void displayInfo() {
        System.out.println("Area: " + calculateArea());
    }
}