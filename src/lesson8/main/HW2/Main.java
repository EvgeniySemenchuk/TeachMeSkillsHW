package lesson8.main.HW2;


//2. Создать классы "Директор", "Рабочий", "Бухгалтер".
//Реализовать интерфейс с методом, который печатает название должности и
//имплементировать этот метод в созданные классы.
public class Main {
    public static void main(String[] args) {
        Position worker1 = new Worker();
        Position worker2 = new Accountant();
        Position worker3 = new Director();
        Position[] workers = new Position[]{worker1,worker2,worker3};
        for (int i = 0; i < workers.length; i++) {
            workers[i].WorkPosition();
        }
    }
}
