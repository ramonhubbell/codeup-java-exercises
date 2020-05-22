package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        System.out.println("ShapesTest is ready!");

//        Create a variable of the type Rectangle named box1
//        and assign it a new instance of the Rectangle class
//        with a width of 4 and a length of 5
//    Rectangle box1 = new Rectangle(5,4);

//        Verify that the getPerimeter and getArea methods return
//        18 and 20, respectively.
//        System.out.println("box1.getPerimeter(): " + box1.getPerimeter());
//        System.out.println("box1.getArea(): " + box1.getArea());

//        Create a variable of the type Rectangle named box2 and
//        assign it a new instance of the Square class that has a
//        side value of 5.
//    Rectangle box2 = new Square(5);
//        System.out.println("box2.getPerimeter(): " + box2.getPerimeter());
//        System.out.println("box2.getArea(): " + box2.getArea());


//        Modify your ShapesTest class, use it to:
//
//        declare a variable of the type Measurable named myShape.
//        Test your code by creating instances of both Square and Rectangle
//        and assigning them to myShape so you can display the shape's area and perimeter.

        Measurable myShape = new Square(5);

        System.out.println( "myShape.getArea(): " + myShape.getArea());
        System.out.println( "myShape.getPerimeter(): " + myShape.getPerimeter());

        myShape = new Rectangle(5,4);
        System.out.println( "myShape2.getArea(): " + myShape.getArea());
        System.out.println( "myShape2.getPerimeter()" + myShape.getPerimeter());


    }
}
