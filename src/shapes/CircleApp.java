package shapes;

import util.Input;

public class CircleApp {


    public static void main(String[] args) {


//    Inside of shapes, create a class named CircleApp that prompts the user
//    for the radius of the circle using your Input class, creates a Circle
//    object, and displays the circumference and area.
        Input input = new Input();
//        Circle circle;
        Circle circle = new Circle(input.getDouble());
        System.out.printf("The circumference of a circle is %.2f\n" , circle.getCircumference());
        System.out.printf("The area of a circle is %.2f\n" , circle.getArea());


    }
}
