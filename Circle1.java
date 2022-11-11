public class Circle1 {
    private final double PI = 3.14159;
    private double radius;

    // default constructor
    public Circle1() {
        radius = 0.0;

    }

    // parametrized constructor
    public Circle1(double r) {
        radius = r;
    }

    //setter( mutator) method for radius
    public void setRadius(double r) {
        radius = r;
    }

    // getter/accesser method  for radius
    public double getRadius() {
        return this.radius;
    }

    // method to calculate  and return area
    public double getArea() {
        return radius * radius * PI;
    }
    public static void main(String[] args) {
             // first  circle object with no argument
Circle1 s = new Circle1();
// second circle object with parametrized constructor
Circle1 s2 = new Circle1(3.5);
// call getArea() method  for object s
            System.out.println("Area of circle for first object s with radius 0 = "+s.getArea());
            // call getArea() method  for  object s2
            System.out.println("Area of circle for second object s2 : "+s2.getArea());
            // set radius for first  s to 1.5
             s.setRadius(1.5);
             //once again call getArea() method for object circle1
            System.out.println("Area of circle for first object circle1 with radius 1.5 : "+s.getArea());

    }
}