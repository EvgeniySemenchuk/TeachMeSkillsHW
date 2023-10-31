package lesson8.main.HW1;

public class Circle extends Shape{
        private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double FindPerimeter() {
        double perimeter = 2*Math.PI*getRadius();
        return perimeter;
    }

    @Override
    public double FindSquare() {
        double square = Math.PI * getRadius()*getRadius();
        return square;
    }
}
