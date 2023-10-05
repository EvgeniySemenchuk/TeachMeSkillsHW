package lesson2.main;

import java.util.Scanner;

public class HW2 {

    //2. Написать программу для вывода названия поры года по номеру
    //месяца.
    //При решении используйте оператор if-else-if.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the month");
        int numberOfMonth = scanner.nextInt();

        if (numberOfMonth == 1 || numberOfMonth == 2 || numberOfMonth == 12) {
            System.out.println("It is winter");
        }
        else if (numberOfMonth >= 3 && numberOfMonth <=5) {
            System.out.println("It is spring");
        }
        else if (numberOfMonth >= 6 && numberOfMonth <=8) {
            System.out.println("It is summer");
        }
        else if (numberOfMonth >= 9 && numberOfMonth <=11) {
            System.out.println("It is autumn");
        }
        else System.out.println("Something get wrong");
    }
}
