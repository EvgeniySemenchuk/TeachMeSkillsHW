package lesson8.AddFromLesson;

//Делаем классы для работы с университетом. В универе есть массив студентов, сотрудников и общежитий.
// Студенты (поля имя, фамилия, номер группы, место проживания),
// сотрудники (поля имя, фамилия, должность - препод, декан, ректор и т д),
// общежитие (адрес, название, массив комнат). Сделать меню с 6 пунктами:
// 1) Добавление студента в универ 2) Добавление сотрудника в универ 3) Заселить студента в общежитие
// 4) Просмотр всех студентов 5) Просмотр всех сотрудников 6) Выход.
public class Main {
    public static void main(String[] args) {
        Dorm dorm1 = new Dorm("Minsk","1");
        Dorm dorm2 = new Dorm("Minsk","2");

        Room room1 = new Room("12",2);
        Room room2 = new Room("13",2);
        Room room3 = new Room("14",2);
        Room room4 = new Room("15",2);
        Room room5 = new Room("16",2);

        dorm1.setRooms(new Room[]{room1,room2,room3,room4,room5});
        dorm2.setRooms(new Room[]{room1,room2,room3,room4,room5});

        University university1 = new University();
        university1.setDorms(new Dorm[]{dorm1,dorm2});
        university1.menu();

    }
}
