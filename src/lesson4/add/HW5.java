package lesson4.add;

import java.util.Arrays;
import java.util.Random;

public class HW5 {

//5. Создайте массив и заполните массив.
//Выведите массив на экран в строку.
//Замените каждый элемент с нечётным индексом на ноль.
//Снова выведете массив на экран на отдельной строке.

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println("Изначальный массив = " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if ( i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println("Измененный массив = " + Arrays.toString(array));
    }
}
