package lesson4.main;

import java.util.Arrays;
import java.util.Scanner;

public class HW1 {
    //1. Создайте массив целых чисел. Удалите все вхождения заданного
    //числа из массива.
    //Пусть число задается с консоли (класс Scanner). Если такого числа нет -
    //выведите сообщения об этом.
    //В результате должен быть новый массив без указанного числа.

    public static void main(String[] args) {
        int[] array = {5,6,3,6,1,7,8,8};
        System.out.println("Изначальный массив " + Arrays.toString(array));
        int[] newArray;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, все вхождения которого хотите удалить");
        int deleteNumber = scanner.nextInt();
        int numberOfNumbersWithoutDeleted = 0;

        for (int x : array) {
            if (x != deleteNumber) {
                numberOfNumbersWithoutDeleted++;
            }
        }

        newArray = new int[numberOfNumbersWithoutDeleted];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != deleteNumber) {
                newArray[j] = array[i];
                j++;
            }
        }

        System.out.println("Новый массив " + Arrays.toString(newArray));
    }
}
