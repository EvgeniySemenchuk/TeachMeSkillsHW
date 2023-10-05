package lesson2.main;

import java.util.Scanner;

public class HW4 {

    //4. Для введенного числа t (температура на улице) вывести
    //Если t>–5, то вывести «Тепло».
    //Если –5>= t > –20, то вывести «Нормально».
    //Если –20>= t, то вывести «Холодно».

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру");
        int t = scanner.nextInt();

        if (t>-5) {
            System.out.println("Тепло");
        } else if (t > -20 && t <=-5) {
            System.out.println("Нормально");
        }
        else System.out.println("Холодно");
    }
}
