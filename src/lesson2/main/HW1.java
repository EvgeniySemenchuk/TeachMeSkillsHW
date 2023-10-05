package lesson2.main;

import java.util.Scanner;

public class HW1 {


    //1. Написать программу для вывода названия поры года по номеру
    //месяца. При решении используйте оператор switch-case.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int numberOfMonth = scanner.nextInt();

        switch (numberOfMonth) {
            case 1:
            case 2:
            case 12:
                System.out.println("It is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It is autumn");
                break;
            default:
                System.out.println("Something is wrong with your number");
        }

    }
}
