package lesson10.add.HW2;

import java.util.Scanner;

//2. Дана строка произвольной длины с произвольными словами.
//Найти самое короткое слово в строке и вывести его на экран.
//Найти самое длинное слово в строке и вывести его на экран.
//Если таких слов несколько, то вывести последнее из них.
public class WorkWithString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = scanner.nextLine();
        LongestWord(string);
    }

    public static void LongestWord(String string) {
        String[] strings = string.split(" ");
        String logestWord = strings[0];
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].length() >= logestWord.length()) {
                logestWord = strings[i];
            }
        }
        System.out.println("Самое длинное слова в строке (или если их несколько - последнее из них) - это " + logestWord);
    }

}
