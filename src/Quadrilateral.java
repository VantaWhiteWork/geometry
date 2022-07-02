public class Quadrilateral {
    private final double side1;
    private final double side2;
    private final double side3;
    private final double side4;

    public Quadrilateral(double side1, double side2, double side3, double side4) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    }

    public double perimeter() {
        return this.side1 + this.side2 + this.side3 + this.side4;
    }
}
