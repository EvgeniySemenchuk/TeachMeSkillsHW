package lesson8.AddFromLesson;

public class Room {
    private String numberOfRoom;
    private int freeCapacity;

    public String getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(String numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getFreeCapacity() {
        return freeCapacity;
    }

    public void setFreeCapacity(int freeCapacity) {
        this.freeCapacity = freeCapacity;
    }

    public Room( String numberOfRoom, int freeCapacity) {
        this.numberOfRoom = numberOfRoom;
        this.freeCapacity = freeCapacity;
    }

    public Room(String numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfRoom='" + numberOfRoom + '\'' +
                '}';
    }
}
