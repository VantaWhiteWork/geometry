public class Square extends Quadrilateral {

    private final double side;

    public Square(double side) {
        super(side, side, side, side);
        this.side = side;
    }

    public double diagonal() {
        return this.side * Math.sqrt(2);
    }
    public double area() {
        return Math.pow(side, 2);
    }
}
