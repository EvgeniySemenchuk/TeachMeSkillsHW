package lesson8.AddFromLesson;

import java.util.Arrays;

public class Dorm {
    private String address;
    private String number;
    private Room[] rooms;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String name) {
        this.number = name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public Dorm() {}

    public Dorm( String address, String number) {
        this.address = address;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Dorm{" +
                "address='" + address + '\'' +
                ", number='" + number + '\'' +
                ", rooms=" + Arrays.toString(rooms) +
                '}';
    }
}
