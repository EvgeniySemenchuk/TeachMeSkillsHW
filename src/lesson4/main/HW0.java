package lesson4.main;

import java.util.Scanner;

public class HW0 {
//0. Создайте массив целых чисел. Напишете программу, которая выводит
//сообщение о том, входит ли заданное число в массив или нет.
//Пусть число для поиска задается с консоли (класс Scanner).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое хотите найти в массиве");
        int number = scanner.nextInt();
        int[] array = new int[] {5,8,9,2,3,60,23,-3,5, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Введенное число входит в массив");
            }
        }

    }

}
