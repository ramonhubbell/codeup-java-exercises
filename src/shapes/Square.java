package shapes;

public class Square extends Quadrilateral {
//    Square should define a constructor that accepts one argument,
//    side, and calls the parent's constructor to set both the length
//    and width to the value of side.
//    protected double side;
//
    public Square (double squareSide) {
        super(squareSide, squareSide);
//        this.side = squareSide;
    }



//    In the Square class, override the getArea and getPerimeter methods
//    with the following definitions for a square:
//    perimeter = 4 x side
//    area = side ^ 2
    public double getArea () {
        return Math.pow(width, 2);
    }

    public double getPerimeter () {
        return 4 * length;
    }

    public void setLength( double squareLength) {
        this.length = squareLength;
        this.width = squareLength;
    }

    public void setWidth( double squareWidth) {
        this.width = squareWidth;
        this.length = squareWidth;
    }







}
