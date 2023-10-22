package lesson6.add.HW1;

public class RAM {
    String name;
    float volume;

    public RAM() {
    }

    public RAM(String name, float volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
