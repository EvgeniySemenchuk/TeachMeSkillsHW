package lesson6.main.HW1;


//1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//Добавьте метод, который позволяет начислять сумму на кредитную
//карточку.
//Добавьте метод, который позволяет снимать с карточки некоторую
//сумму.
//Добавьте метод, который выводит текущую информацию о карточке.
//Напишите программу, которая создает три объекта класса CreditCard у
//которых заданы номер счета и начальная сумма
//Тестовый сценарий для проверки:
//Положите деньги на первые две карточки и снимите с третьей.
//Выведите на экран текущее состояние всех трех карточек.
public class CreditCard {
    String accountNumber;
    float moneyOnAccount;

    public void AddMoneyOnAccount(int plus) {
        this.moneyOnAccount += plus;
    }

    public CreditCard(String accountNumber, float moneyOnAccount) {
        this.accountNumber = accountNumber;
        this.moneyOnAccount = moneyOnAccount;
    }

    public void WithDrawMoneyFromAccount(int minus) {
        this.moneyOnAccount -=minus;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "accountNumber='" + accountNumber + '\'' +
                ", moneyOnAccount=" + moneyOnAccount +
                '}';
    }
}
