package lesson6.add.HW1;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer(2000,"Lenovo");
        HDD hdd1 = new HDD();
        RAM ram1 = new RAM();
        computer1.hdd = hdd1;
        computer1.ram = ram1;
        Computer computer2 = new Computer(3000, "Asus",new HDD("Cavier",256,"inner"),new RAM("KingSton",8));

        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
    }
}
