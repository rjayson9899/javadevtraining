package ProgrammingInJava.chapter9;

public class Circle{
    private static final double PI = 3.14;
    private double radius;

    public Circle(){
        radius = 1;
    }

    public void setRadius(double newRadius){
        radius = newRadius;
    }

    public double area(){
        double circleArea;

        circleArea = PI * radius * radius;
        return(circleArea);
    }

    public double getRadius(){
        return(radius);
    }

    public double circumference(){
        double circleCircumference;

        circleCircumference = 2 * PI * radius;
        return(circleCircumference);
    }

    public static void main(String[] args) {
        Circle spot = new Circle();

        spot.setRadius(3);
        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle circumference: " + spot.circumference());
    }
}