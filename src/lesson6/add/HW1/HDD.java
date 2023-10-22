package lesson6.add.HW1;

public class HDD {
    String name;
    float volume;
    String type;

    public HDD() {
    }

    public HDD(String name, float volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }
}
