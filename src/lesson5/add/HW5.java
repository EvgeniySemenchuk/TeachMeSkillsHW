package lesson5.add;

import java.util.Arrays;
import java.util.Random;

public class HW5 {
//5. Создайте двумерный массив целых чисел. Отсортируйте элементы в строках
//двумерного массива по возрастанию.


    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random random = new Random();

        System.out.println("Изначальный массив ");
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Отсортированный массив ");
        for (int i = 0; i < array.length ; i++) {
                Arrays.sort(array[i]);
        }
        System.out.println(Arrays.deepToString(array));

    }
}
