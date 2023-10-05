package lesson2.main;

import java.util.Scanner;

public class HW3 {

    //3. Напишите программу, которая будет принимать на вход число и на
    //выход будет выводить сообщение четное число или нет.
    //Для определения четности числа используйте операцию получения
    //остатка от деления - операция выглядит так: '% 2').

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите чилсо");
        int number = scanner.nextInt();

        if(number % 2 == 0) {
            System.out.println("Вы ввели честно число");
        }
        else System.out.println("Вы ввели нечетно число");
    }

}
