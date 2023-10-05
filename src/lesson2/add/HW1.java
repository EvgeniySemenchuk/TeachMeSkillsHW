package lesson2.add;

public class HW1 {
    //1. Выведите на экран первые 11 членов последовательности Фибоначчи.

    public static void main(String[] args) {

        int firstNumber = 0;
        int secondNumber = 1;
        System.out.print(firstNumber + " " + secondNumber + " ");

        for (int i = 2; i < 11; i++) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

    }
}