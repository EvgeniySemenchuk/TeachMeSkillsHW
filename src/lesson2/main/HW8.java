package lesson2.main;

import java.util.Scanner;

public class HW8 {
    //3. Напишите программу, где пользователь вводит любое целое
    //положительное число. А программа суммирует все числа от 1 до
    //введенного пользователем числа.
    //Для ввода числа воспользуйтесь классом Scanner.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число");
        int number = scanner.nextInt();
        int summ = 0;
        for (int i = 0; i < number; i++) {
            summ += i;
        }
        System.out.println("Cумма = " + summ);
    }
}
