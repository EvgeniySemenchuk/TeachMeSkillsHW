package lesson5.add;

import java.util.Random;

public class HW2 {
    //2. Умножение двух матриц
    //Создайте два массива целых чисел размером 3х3 (две матрицы).
    //Напишите программу для умножения двух матриц.
    //Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
    //Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
    //Ожидаемый результат: 1 2 3 1 1 1 0 0 0

    public static void main(String[] args) {
        Random random = new Random();
        int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];
        int[][] resultMatrix = new int[3][3];
        System.out.println("Первая матрица");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = random.nextInt(5);
                System.out.print(array1[i][j]+ " ") ;
            }
            System.out.println();
        }
        System.out.println("Вторая матрица");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = random.nextInt(5);
                System.out.print(array2[i][j]+ " ") ;
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    resultMatrix[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        System.out.println("Итоговая матрица после умножения");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    }

