package shapes;

public class Square extends Rectangle {
//    Square should define a constructor that accepts one argument,
//    side, and calls the parent's constructor to set both the length
//    and width to the value of side.
    protected int side;

    public Square (int squareSide) {
        super(squareSide, squareSide);
        this.side = squareSide;
    }

//    In the Square class, override the getArea and getPerimeter methods
//    with the following definitions for a square:
//    perimeter = 4 x side
//    area = side ^ 2
    public int getArea () {
        return side * 2;
    }

    public int getPerimeter () {
        return 4 * side;
    }








}
