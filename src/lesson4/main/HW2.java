package lesson4.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW2 {

    //2. Создайте и заполните массив случайным числами и выведете
    //максимальное, минимальное и среднее значение.
    //Для генерации случайного числа используйте метод Math.random().
    //Пусть будет возможность создавать массив произвольного размера.
    //Пусть размер массива вводится с консоли.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива");
        int lengthOfArray = scanner.nextInt();
        int[] array = new int[lengthOfArray];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.println("Массив = " + Arrays.toString(array));

        int max = array[0];
        int min = array[0];
        int summ = 0;
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) { max = array[i];}
            if (array[i] < min) { min = array[i];}
            summ += array[i];
        }
        avg = (double) summ/lengthOfArray;

        System.out.println("Макс. элемент = " + max + '\n' + "Мин. элемент = " + min + '\n' +
                "Среднее = " + avg);

    }
}
