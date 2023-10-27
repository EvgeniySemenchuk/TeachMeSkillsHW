package lesson8.main.HW1;

public class Rectangle extends Shape {

    Rectangle(double side1,double side2) {
        super(side1,side2);
    }

    @Override
    public double FindSquare() {
        double square = getSide1() * getSide2();
        return square;
    }

    @Override
    public double FindPerimeter() {
        double perimetr = getSide1()*2 + getSide2()*2;
        return perimetr;
    }
}
