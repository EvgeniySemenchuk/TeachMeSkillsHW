package lesson4.add;

import java.util.Arrays;
import java.util.Random;

public class HW7 {

    //7.Реализуйте алгоритм сортировки пузырьком.

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = current;
        }
        System.out.println("Отсортированный массив = " + Arrays.toString(array));
    }



    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Изначальный массив = " + Arrays.toString(array));
        insertionSort(array);
    }
}
