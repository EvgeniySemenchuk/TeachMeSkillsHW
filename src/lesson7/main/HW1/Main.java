package lesson7.main.HW1;

import static lesson7.main.HW1.Phone.sendMessage;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375333734351","Xiomi",15);
        Phone phone2 = new Phone("+375293554351","IPhone",16);
        Phone phone3 = new Phone("+375333666351","Samsung",17);
        System.out.println("Параметры всех телефонов");
        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());
        System.out.println("Проверка методов receiveCall и getNumber");
        phone1.receiveCall("Evgeniy", phone1.getNumber());
        phone2.receiveCall("Oleg", phone2.getNumber());
        phone3.receiveCall("Konstantin",phone3.getNumber());
        System.out.println("Проверка метода sendMessage");
        sendMessage(phone1.getNumber(),phone2.getNumber(),phone3.getNumber());

    }
}
