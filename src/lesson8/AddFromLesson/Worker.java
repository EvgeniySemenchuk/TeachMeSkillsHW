package lesson8.AddFromLesson;

public class Worker extends Person {
    private String workPosition;

    public String getWorkPosition() {
        return workPosition;
    }

    public void setWorkPosition(String workPosition) {
        this.workPosition = workPosition;
    }

    public Worker(String name, String surname, String workPosition) {
        super(name, surname);
        this.workPosition = workPosition;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workPosition='" + workPosition + '\'' +
                "} " + super.toString();
    }
}
