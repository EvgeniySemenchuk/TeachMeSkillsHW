package lesson8.main.HW1;

public class Triangle extends Shape{
    private double side3;

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    Triangle(double side1, double side2, double side3) {
        super(side1,side2);
        this.side3 = side3;
    }

    @Override
    public double FindPerimeter() {
        double perimeter = getSide1() + getSide2() + getSide3();
        return perimeter;
    }

    @Override
    public double FindSquare() {
        double square = Math.sqrt(FindPerimeter()/2 * (FindPerimeter()/2-getSide1())*(FindPerimeter()/2-getSide2())*(FindPerimeter()/2-getSide2()));
        return square;
    }
}
