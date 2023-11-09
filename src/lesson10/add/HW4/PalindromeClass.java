package lesson10.add.HW4;

import static java.lang.String.valueOf;

//4. Дана строка произвольной длины с произвольными словами.
//Написать программу для проверки является ли любое выбранное слово в
//строке палиндромом.
//Например, есть строка, вводится число 3, значит необходимо проверить
//является ли 3-е слово в этой строке палиндромом. Предусмотреть предупреждающие сообщения на случаи ошибочных
//ситуаций: например, в строке 5 слов, а на вход программе передали число
//500 и т. п. ситуации.
public class PalindromeClass {

    public static void CheckForPalindrome(String string) {
      StringBuilder stringBuilder = new StringBuilder(string);
      String newString = stringBuilder.reverse().toString();
      if(newString.equals(string)) {
          System.out.println("Палиндром!");
      } else System.out.println("Не палиндром!");

    }
}
