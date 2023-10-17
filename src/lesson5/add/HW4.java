package lesson5.add;

import java.util.Random;

public class HW4 {
//4. Создайте двумерный массив. Выведите на консоль диагонали массива
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[3][3];
        System.out.println("Изначальный массив");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Главная диагональ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i==j) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("Побочная диагональ");
        int k = array.length - 1;
        for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array[i].length; j++) {
                 if (j == k) {
                     k--;
                     System.out.print(array[i][j] + " ");
                 }
            }
        }

    }
}
