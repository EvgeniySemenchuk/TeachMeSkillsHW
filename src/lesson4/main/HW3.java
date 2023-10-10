package lesson4.main;

import java.util.Arrays;
import java.util.Random;

public class HW3 {
//3. Создайте 2 массива из 5 чисел.
//Выведите массивы на консоль в двух отдельных строках.
//Посчитайте среднее арифметическое элементов каждого массива и
//сообщите, для какого из массивов это значение оказалось больше (либо
//сообщите, что их средние арифметические равны).
//Дополнительное задание

    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(20);
            array2[i] = random.nextInt(20);
        }
        System.out.println("Массив 1 = " + Arrays.toString(array1) + '\n' + "Массив 2 = " + Arrays.toString(array2) + '\n');

        int summ1 = 0;
        int summ2 = 0;
        double avg1;
        double avg2;

        for (int i = 0; i < array1.length; i++) {
            summ1 += array1[i];
            summ2 += array2[i];
        }

        avg1 = (double) summ1/array1.length;
        avg2 = (double)summ2/array2.length;

        if (avg1 > avg2) {
            System.out.println("Среднее 1-го массива больше 2-го, так как " + avg1 + " > " + avg2);
        }
        else if (avg1 < avg2) {
            System.out.println("Среднее 2-го массива больше 1-го, так как " + avg1 + " < " + avg2);
        } else System.out.println("Средние значения 2-ух массивов равны");

    }
}
