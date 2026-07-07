public class Sphere {

    private double radius;

    public Sphere(double radius) {

        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than 0.");
        }

        this.radius = radius;
    }

    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}