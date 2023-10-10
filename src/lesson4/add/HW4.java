package lesson4.add;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW4 {

//4. Создайте массив из n случайных целых чисел и выведите его на
//экран.
//Размер массива пусть задается с консоли и размер массива может быть
//больше 5 и меньше или равно 10.
//Если n не удовлетворяет условию - выведите сообщение об этом.
//Если пользователь ввёл не подходящее число, то программа должна
//просить пользователя повторить ввод.
//Создайте второй массив только из чётных элементов первого массива,
//если они там есть, и вывести его на экран.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер 1-го массива (больше 5 и меньше или равно 10) ");
        int lengthOfArray1;
        while (true) {
            lengthOfArray1 = scanner.nextInt();
            if(lengthOfArray1 > 5 && lengthOfArray1 <= 10) {
                break;
            }
            else {
                System.out.println("Введенное значение не входит в необходимый диапазон, введите еще раз");
            }
        }
        int numberOfChetNumber = 0;
        int[] array1 = new int[lengthOfArray1];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(20);
            if(array1[i] % 2 == 0) {numberOfChetNumber++;}
        }
        System.out.println("Массив 1 = " + Arrays.toString(array1));

        int[] array2 = new int[numberOfChetNumber];

        for (int i = 0, j = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array2[j] = array1[i];
                j++;
            }
        }
        System.out.println("Новый массив из четных чисел = " + Arrays.toString(array2));


    }
}
