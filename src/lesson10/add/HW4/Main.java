package lesson10.add.HW4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку из произвольного числа слов");
            String string = scanner.nextLine();
            String[] strings = string.split(" ");
            int numberOfWord = 0;
        while(true) {
            System.out.println("Введите номер слова, которое хотите проверить на палиндром");
            numberOfWord = scanner.nextInt();
            if(strings.length < numberOfWord) {
                System.out.println("В строке нет так много слов, введите еще раз номер слова");
                continue;
            }
            break;
        }
        String stringForPalindromeCheck;
        for (int i = 0; i < strings.length; i++) {
            if((i+1)==numberOfWord) {
                stringForPalindromeCheck = strings[i];
                PalindromeClass.CheckForPalindrome(stringForPalindromeCheck);
            }
        }

        }
    }

