package lesson5.main;

import java.util.Random;
import java.util.Scanner;

public class HW0 {
//Создать трехмерный массив из целых чисел.
//С помощью циклов "пройти" по всему массиву и увеличить каждый элемент на
//заданное число. Пусть число, на которое будет увеличиваться каждый элемент,
//задается из консоли.

    public static void main(String[] args) {
        int array[][][] = new int[3][3][3];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, на которое хотите увеличить каждый элемент");
        int number = scanner.nextInt();
        System.out.println("Изначальный массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = random.nextInt(10);
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("---------------------");
        System.out.println("Массив после увеличения");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print((array[i][j][k] + 1) + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
