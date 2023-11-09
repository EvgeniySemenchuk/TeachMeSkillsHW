package lesson11.HW1;

import java.util.Iterator;
import java.util.List;

//Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
//оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
//Написать метод, который удаляет студентов со средним баллом <3. Если средний
//балл>=3, студент переводится на следующий курс. Дополнительно написать метод
//printStudents(List<Student> students, int course), который получает список студентов и
//номер курса. А также печатает на консоль имена тех студентов из списка, которые
//обучаются на данном курсе
public class Student {
    private String name;
    private String groupNumber;
    private int course;
    private double mark;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public Student(String name, String groupNumber, int course, double mark) {
        this.name = name;
        this.groupNumber = groupNumber;
        this.course = course;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                ", course=" + course +
                ", mark=" + mark +
                '}';
    }

    public static void printStudents(List<Student> students, int course) {
        System.out.println("Студенты, обущающиеся на " + course + " курсе");
        for (Student x : students) {
            if(x.getCourse() == course) {
                System.out.println(x.toString());
            }
        }
    }

    public static void NextCourseOrDelete(List<Student> students) {
        Iterator<Student> studentIterator = students.iterator();
        while(studentIterator.hasNext()) {
            Student nextStudent = studentIterator.next();
            if(nextStudent.getMark() < 3) {
                studentIterator.remove();
            } else nextStudent.course +=1;
        }
    }

    public static void PrintAllStudents(List<Student> students) {
        System.out.println("Все студенты");
        for (Student x : students) {
            System.out.println(x.toString());
        }
    }

}
