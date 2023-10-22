package lesson6.main.HW1;

public class Main
{
    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard("12346BY544234FG", 2000);
        CreditCard creditCard2 = new CreditCard("987746NUY5442BB", 4000);
        CreditCard creditCard3 = new CreditCard("16746OI544534TG", 3500);
        System.out.println("Информация на счетах до проведения операций");
        System.out.println(creditCard1.toString());
        System.out.println(creditCard2.toString());
        System.out.println(creditCard3.toString());
        System.out.println("Информация на счетах после проведения операций");
        creditCard1.AddMoneyOnAccount(430);
        creditCard2.AddMoneyOnAccount(220);
        creditCard3.WithDrawMoneyFromAccount(540);
        System.out.println(creditCard1.toString());
        System.out.println(creditCard2.toString());
        System.out.println(creditCard3.toString());

    }
}
