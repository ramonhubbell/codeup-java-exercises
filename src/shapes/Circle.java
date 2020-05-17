package shapes;

public class Circle {

    //    Creating fields.
    private double radius ;

//    Constructor.
    public Circle ( double radiusCircle) {
        this.radius = radiusCircle;
    }

//    The plan template.

//    public Circle(double radius)
    public double getArea() {
//        area = pi x (radius ^ 2)
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }

    public double getCircumference() {
//        circumference = 2 x pi x radius
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }





}
