package lesson7.main.HW1;


//1. Класс Phone.
//Создайте класс Phone, который содержит переменные number, model и
//weight.
//Создайте три экземпляра этого класса.
//Выведите на консоль значения их переменных.
//Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
//звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber –
//возвращает номер телефона. Вызвать эти методы для каждого из
//объектов.
//Добавить конструктор в класс Phone, который принимает на вход три
//параметра для инициализации переменных класса - number, model и
//weight.
//Добавить конструктор, который принимает на вход два параметра для
//инициализации переменных класса - number, model.
//Добавить конструктор без параметров.
//Вызвать из конструктора с тремя параметрами конструктор с двумя.
//Добавьте перегруженный метод receiveCall, который принимает два
//параметра - имя звонящего и номер телефона звонящего. Вызвать этот
//метод.
//Создать метод sendMessage с аргументами переменной длины. Данный
//метод принимает на вход номера телефонов, которым будет отправлено
//сообщение. Метод выводит на консоль номера этих телефонов.
public class Phone {
    private String number;
    private String model;
    private float weight;

    public Phone(String number, String model, float weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void receiveCall (String name) {
        System.out.println("Звонит " + "{ " + name + " }");
    }

    public void receiveCall(String name, String number ) {
        System.out.println("Звонит " + "{ " + name + " } по номеру " + number );
    }

    public static void sendMessage(String ... numbers) {
        System.out.println("Номера телефонов, которым будет отправленно сообщение");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
