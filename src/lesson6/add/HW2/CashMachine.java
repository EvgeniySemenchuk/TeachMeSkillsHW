package lesson6.add.HW2;

import java.util.Scanner;

//2. Создать класс, описывающий банкомат.
//Набор купюр, находящихся в банкомате, должен задаваться тремя
//свойствами:
//количеством купюр номиналом 20, 50 и 100.
//Сделать метод для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая принимает сумму денег,
//а возвращает булевое значение - успешность выполнения операции.
//При снятии денег функция должна распечатывать каким количеством
//купюр какого номинала выдаётся сумма.
//Создать конструктор с тремя параметрами - количеством купюр каждого
//номинала.
//ДЕЛАЛ ПРОСТУЮ ВЕРСИЮ
public class CashMachine {
    int num20;
    int num50;
    int num100;
    static Scanner scanner = new Scanner(System.in);

    public CashMachine(int num20, int num50, int num100) {
        this.num20 = num20;
        this.num50 = num50;
        this.num100 = num100;
    }

    public void addMoneyInCashMachine () {
        System.out.println("Введите номинал, который хотите добавить в банкомат (20,50,100)");
        int nom = scanner.nextInt();
        System.out.println("Введите количество купюр");
        int numberOfnom = scanner.nextInt();
        if(nom == 20) num20+=numberOfnom;
        else if (nom == 50) {
            num50+=numberOfnom;
        } else if (nom == 100) {
            num100+=numberOfnom;
        } else System.out.println("Такого номинала в банкомате нет!");
        System.out.println("Всего денег после пополнения " + (num20*20+num50*50+num100*100));
    }

    public boolean WithDrawMoneyFromCashMachine (int sum) {
        if((num20*20+num50*50+num100*100) >= sum)
        {
            System.out.println("Деньги можно снять , в банкомате достаточно денег для выдачи " + sum);
            return true;
        }
        else {
            System.out.println("Ошибка, не удасться снять " + sum + " ,так как в банкомате недостаточно денег");
            return false;
        }
    }




}
