package lesson4.add;

import java.util.Arrays;

public class HW6 {
//6. Создайте массив строк. Заполните его произвольными именами
//людей.
//Отсортируйте массив.
//Результат выведите на консоль.

    public static void main(String[] args) {
        String[] array = new String[] {"Evgeniy","Sergey","Igor","Konstantin","Ilya","Zahar"};
        System.out.println("Изначальный массив = " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Изменный массив после сортировки = " + Arrays.toString(array));

    }
}
