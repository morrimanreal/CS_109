public class Cylinder {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {

        if (radius <= 0 || height <= 0) {
            throw new IllegalArgumentException("Radius and height must be greater than 0.");
        }

        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}