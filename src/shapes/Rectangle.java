package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
//    It should have protected properties for both length and width.
//    protected double length;
//    protected double width;

//    Rectangle should define a constructor that accepts two numbers
//    for length and width, and sets those properties.
//    public Rectangle (double rectangleLength, double rectangleWidth) {
//        this.length = rectangleLength;
//        this.width = rectangleWidth;
//    }

//    Create two methods on the Rectangle class, getArea and getPerimeter
//    that return the respective values. The formulas for both follow:
//    perimeter = 2 x length + 2 x width
//    area = length x width

//    public double getArea () {
//        return this.length * this.width;
//    }
//
//    public double getPerimeter () {
//        return (2 * this.length) + ( 2 * this.width);
//    }


    public double getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double setLength() {
        return this.length;
    }

    public double setWidth() {
        return this.width;
    }


}
