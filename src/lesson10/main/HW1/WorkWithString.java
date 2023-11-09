package lesson10.main.HW1;

import java.util.Arrays;

//1. Написать программу со следующим функционалом:
//На вход передать строку (будем считать, что это номер документа).
//Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
//а y — это буква.
//- Вывести на экран в одну строку два первых блока по 4 цифры.
//- Вывести на экран номер документа, но блоки из трех букв заменить
//на *** (каждая буква заменятся на *).
//- Вывести на экран только одни буквы из номера документа в
//формате yyy/yyy/y/y в нижнем регистре.
//- Вывести на экран буквы из номера документа в формате
//"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
//класса StringBuilder).
//- Проверить содержит ли номер документа последовательность abc и
//вывети сообщение содержит или нет(причем, abc и ABC считается
//одинаковой последовательностью).
//- Проверить начинается ли номер документа с последовательности
//555.
//- Проверить заканчивается ли номер документа на
//последовательность 1a2b.
//Все эти методы реализовать в отдельном классе в статических методах,
//которые на вход (входным параметром) будут принимать вводимую на
//вход программы строку.
public class WorkWithString {

        public static void TwoDigitBlock(String string) {
            String[] strings = string.split("-");
            System.out.println("Первые два числовых блока - " + strings[0] + " и " + strings[2]);
        }

        public static void ChangeLetters (String string) {
            String[] strings = string.split("-");
            for (int i = 0; i < strings.length; i++) {
                    if (i == 1 || i == 3) {
                      strings[i] = strings[i].replace(strings[i],"***");
                }
            }
            String result = String.join("-", strings);
            System.out.println("Результат замены буквы на символ * в блоках из 3-ех букв " + result);
        }

        public static void OnlyLetterInLowerCasesInSlashFormat (String string) {
            String sub1 = string.substring(5,8);
            String sub2 = string.substring(14,17);
            String sub3 = string.substring(19,20);
            String sub4 = string.substring(21,22);
            String result = String.join("/",sub1,sub2,sub3,sub4).toLowerCase();
            System.out.println("Формат yyy/yyy/y/y отправленного документа в нижнем регистре - " + result);
        }

        public static void OnlyLetterInUpperCaseInSlashFormat(String string) {
            StringBuilder stringBuilder = new StringBuilder(string.toUpperCase());
            stringBuilder.delete(0,5);
            stringBuilder.delete(3,8);
            stringBuilder.delete(8,9);
            stringBuilder.delete(9,10);
            stringBuilder.insert(9,'-');
            for (int i = 0; i < stringBuilder.length(); i++) {
                if(stringBuilder.charAt(i) == '-') {
                    stringBuilder.setCharAt(i,'/');
                }
            }
            System.out.println("Формат Letters:yyy/yyy/y/y отправленного документа в врехнем регистре - " + "Letters:" +stringBuilder);
        }

        public static boolean containsSequence(String string, String sequence) {
            return string.toLowerCase().contains(sequence.toLowerCase());
        }

        public static boolean startsWithSequence(String string) {
            return string.startsWith("555");
        }

        public static boolean endsWithSequence(String string) {
            return string.endsWith("1a2b");
        }


}
