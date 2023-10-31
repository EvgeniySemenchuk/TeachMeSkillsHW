package lesson8.AddFromLesson;

public class Student extends Person{
    private String groupNumber;
    private String placeOfLiving;
    private Dorm dorm;
    private Room room;
    private boolean needInDorm; // true - need dorm, false - don't need

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Dorm getDorm() {
        return dorm;
    }

    public void setDorm(Dorm dorm) {
        this.dorm = dorm;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }

    public void setPlaceOfLiving(String placeOfLiving) {
        this.placeOfLiving = placeOfLiving;
    }

    public boolean isNeedInDorm() {
        return needInDorm;
    }

    public void setNeedInDorm(boolean needInDorm) {
        this.needInDorm = needInDorm;
    }

    Student(String name, String surname, String groupNumber, String placeOfLiving, boolean needInDorm) {
        super(name,surname);
        this.groupNumber =groupNumber;
        this.placeOfLiving = placeOfLiving;
        this.needInDorm = needInDorm;
    }

    Student(String name, String surname) {
        super(name,surname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupNumber='" + groupNumber + '\'' +
                ", placeOfLiving='" + placeOfLiving + '\'' +
                ", dorm=" + dorm +
                ", room=" + room +
                ", needInDorm=" + needInDorm +
                "} " + super.toString();
    }

}
