package lesson8.main.HW1;

//Основное задание
//1. Написать иерархию классов «Фигуры».
//Фигура -> Треугольник -> Прямоугольник -> Круг.
//Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
//периметра.
//Создать массив из 5 фигур.
//Вывести на экран сумму периметра всех фигур в массиве.
public abstract class Shape {
    private double side1;
    private double side2;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public Shape(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public  Shape() {}


    public abstract double FindSquare();
    public abstract double FindPerimeter();

}
