package lesson6.add.HW2;

public class Main {
    public static void main(String[] args) {
        CashMachine cashMachine1 = new CashMachine(2,2,2);
        cashMachine1.addMoneyInCashMachine();
        cashMachine1.WithDrawMoneyFromCashMachine(800);
        cashMachine1.WithDrawMoneyFromCashMachine(100);
    }
}
