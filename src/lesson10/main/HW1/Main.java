package lesson10.main.HW1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку формата xxxx-yyy-xxxx-yyy-xyxy");
        String string  = scanner.nextLine();

        WorkWithString.TwoDigitBlock(string);
        WorkWithString.ChangeLetters(string);
        WorkWithString.OnlyLetterInLowerCasesInSlashFormat(string);
        WorkWithString.OnlyLetterInUpperCaseInSlashFormat(string);
        System.out.println("Содержит ли строка " + string + " подстроку abс или ABC? - " + WorkWithString.containsSequence(string,"abc"));
        System.out.println("Начинается ли строка " + string + " с последовательность 555 - " + WorkWithString.startsWithSequence(string));
        System.out.println("Заканчивается ли строка " + string + " последовательностью 1a2b - " + WorkWithString.endsWithSequence(string));
    }

}
