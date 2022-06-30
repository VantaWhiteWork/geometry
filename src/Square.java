public class Square {
    final public int side;

    public Square(int side) {
        this.side = side;
    }

    public double diagonal() {
        return this.side * Math.sqrt(2);
    }
}
