public class Cube {

    private double side;

    public Cube(double side) {

        if (side <= 0) {
            throw new IllegalArgumentException("Side length must be greater than 0.");
        }

        this.side = side;
    }

    public double getVolume() {
        return side * side * side;
    }
}