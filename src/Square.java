class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return side * side;
    }
}