package lesson2.add;

import java.util.Scanner;

public class HW2 {

    //2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
    //Напишите программу, в которую пользователь вводит сумму вклада и
    //количество месяцев. А банк вычисляет конечную сумму вклада с учетом
    //начисления процентов за каждый месяц.
    //Для вычисления суммы с учетом процентов используйте цикл for. Пусть
    //сумма вклада будет представлять тип float.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        float deposit = scanner.nextFloat();
        System.out.println("Введите количество месяцев");
        int numberOfMonth = scanner.nextInt();

        for (int i = 0; i < numberOfMonth; i++) {
            deposit = deposit + deposit*0.07f;
        }

        System.out.println("Итоговая сумма на счету после " + numberOfMonth + " месяцев = " + deposit);

    }
}
