package lesson11.HW1;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Evgeniy","173903",3,8.1));
        studentList.add(new Student("Konstantin","273903",2,8.2));
        studentList.add(new Student("Maria","273902",2,2.8));
        studentList.add(new Student("Ivan","373903",1,2.7));
        studentList.add(new Student("Petr","373903",1,5.6));
        Student.PrintAllStudents(studentList);
        Student.printStudents(studentList,2);
        System.out.println("Удаляем студентов с плохим средним баллом");
        Student.NextCourseOrDelete(studentList);
        Student.PrintAllStudents(studentList);
    }
}
