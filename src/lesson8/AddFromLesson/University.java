package lesson8.AddFromLesson;

import java.util.Scanner;

public class University {
   private Student[] students;
   private Dorm[] dorms;
   private Worker[] workers;

    static Scanner scanner = new Scanner(System.in);

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Dorm[] getDorms() {
        return dorms;
    }

    public void setDorms(Dorm[] dorms) {
        this.dorms = dorms;
    }

    public Worker[] getWorkers() {
        return workers;
    }

    public void setWorkers(Worker[] workers) {
        this.workers = workers;
    }

    University() {
        students = new Student[20];
        dorms = new Dorm[2];
        workers = new Worker[20];
    }

    static public void printMenu() {
        System.out.println("1.Добавление студента в универ");
        System.out.println("2.Добавление сотрудника в универ");
        System.out.println("3.Заселить студента в общежитие");
        System.out.println("4.Просмотр всех студентов");
        System.out.println("5.Просмотр всех сотрудников");
        System.out.println("6.Выход");
    }

    public void menu() {
        boolean exit = true;
        while (exit) {
            System.out.println("Сделайте свой выбор: ");
            printMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    this.AddStudent();
                    break;
                case 2:
                    this.AddWorker();
                    break;
                case 3:
                    this.GiveToStudentADorm();
                    break;
                case 4:
                    this.ShowAllStudent();
                    break;
                case 5:
                    this.ShowAllWorkers();
                    break;
                case 6:
                    exit = false;
                    break;
                default:
                    System.out.println("Некорректный выбор, введите снова");
            }
        }
    }

    public void GiveToStudentADorm() {
        System.out.println("Введите фамилию студента, которого хотите заселить");
        String studentSurname = scanner.next();
     OUTER:   for (int i = 0; i < dorms.length; i++) {
            for (int j = 0; j < dorms[i].getRooms().length; j++) {
                for (int k = 0; k < students.length; k++) {
                    if( students[k] !=null && students[k].getSurname().equals(studentSurname) && dorms[i].getRooms()[j].getFreeCapacity() > 0) {
                        students[k].setNeedInDorm(false);
                        students[k].setRoom(new Room(dorms[i].getRooms()[j].getNumberOfRoom()));
                        students[k].setDorm(new Dorm(dorms[i].getAddress(),dorms[i].getNumber()));
                        dorms[i].getRooms()[j].setFreeCapacity( dorms[i].getRooms()[j].getFreeCapacity() - 1);
                        System.out.println( dorms[i].getRooms()[j].getFreeCapacity());
                        System.out.println("Студент " + studentSurname + " заселен");
                        break OUTER;
                    }
                }
            }
         System.out.println("Студент " + studentSurname + " не был заселен");
        }

        }



    public void ShowAllStudent() {
        System.out.println("Список всех студентов");
        for (int i = 0; i < students.length; i++) {
            if(students[i]!=null) {
                System.out.println(students[i].toString());
            }
        }
    }

    public void ShowAllWorkers() {
        System.out.println("Список всех студентов");
        for (int i = 0; i < workers.length; i++) {
            if(workers[i] != null) {
                System.out.println(workers[i].toString());
            }
        }
    }

    public void AddStudent() {
        System.out.println("Введите имя студента, которого хотите добавить");
        String name = scanner.next();
        System.out.println("Введите фамилию студента, которого хотите добавить");
        String surname = scanner.next();
        System.out.println("Введите номер группы студента, которого хотите добавить");
        String numberOfGroup = scanner.next();
        System.out.println("Введите место проживания студента, которого нужно добавить");
        String placeOfLiving = scanner.next();
        System.out.println("Нужно ли студента общежитие?");
        Boolean need = scanner.nextBoolean();
        for (int i = 0; i < students.length; i++) {
            if (students[i]==null) {
                students[i] = new Student(name, surname, numberOfGroup, placeOfLiving,need);
                break;
            }
        }
    }

    public void AddWorker() {
        System.out.println("Введите имя работника, которого хотите добавить");
        String name = scanner.next();
        System.out.println("Введите фамилию работника, которого хотите добавить");
        String surname = scanner.next();
        System.out.println("Введите должность работника, которого хотите добавить");
        String workPosition = scanner.next();
        for (int i = 0; i < workers.length; i++) {
            if (workers[i]==null) {
                workers[i] = new Worker(name, surname, workPosition);
                break;
            }
        }
    }
}

