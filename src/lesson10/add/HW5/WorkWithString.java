package lesson10.add.HW5;

import java.util.Scanner;

//5. Дана произвольная строка.
//Вывести на консоль новую строку, которой задублирована каждая буква из
//начальной строки.
//Например, "Hello" -> "HHeelllloo".
public class WorkWithString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = scanner.nextLine();
        DuplicateAllLetters(string);
    }

    public static void DuplicateAllLetters(String string) {
        String[] string1 = string.split("");
        System.out.println("Результат дублирования ");
        for (int i = 0; i < string1.length; i++) {
            if(string1[i].equals(" ")) {
                System.out.print(" ");
            } else {
                System.out.print(string1[i] + string1[i]);
            }
        }
    }
}
