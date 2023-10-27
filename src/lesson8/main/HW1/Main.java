package lesson8.main.HW1;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Shape triangle1 = new Triangle(5,5,8);
        Shape triangle2 = new Triangle(5,5,8);
        Shape rectangle1 = new Rectangle(4,3);
        Shape rectangle2 = new Rectangle(4,3);
        Shape circle1 = new Circle(1);
        Shape[] arrayOfShapes = new Shape[]{triangle1,triangle2,rectangle1,rectangle2,circle1};
        double sumOfSquares = 0;
        double sumOfPerimeters = 0;
        for (int i = 0; i < arrayOfShapes.length; i++) {
            sumOfSquares += arrayOfShapes[i].FindSquare();
            sumOfPerimeters += arrayOfShapes[i].FindPerimeter();
        }
        System.out.println("Сумма площадей = " + sumOfSquares);
        System.out.println("Cумма периметров = " + sumOfPerimeters);

    }
}
