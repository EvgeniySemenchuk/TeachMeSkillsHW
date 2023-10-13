package lesson5.add;

import java.util.Random;

public class HW3 {
//3. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех
//элементов массива.

    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[3][3];
        int sum = 0;
        System.out.println("Изначальный массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                sum+=array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма элементов = " + sum);
    }
}
