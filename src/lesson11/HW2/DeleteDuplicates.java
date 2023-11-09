package lesson11.HW2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
//4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
//При решении использовать коллекции.
public class DeleteDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку цифр");
        String string = scanner.nextLine();
        Set<String> hashset = new HashSet<>();
        DeleteDuplicates(hashset,string);
    }

    public static void DeleteDuplicates(Set<String> hashSet, String string) {
        String[] newString = string.split(" ");
        for (int i = 0; i < newString.length; i++) {
            hashSet.add(newString[i]);
        }
        System.out.println("Все элементы после удаления дубликатов");
        for (String x: hashSet) {
            System.out.print(x + " ");
        }
    }
}
