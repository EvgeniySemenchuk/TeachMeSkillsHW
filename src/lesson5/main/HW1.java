package lesson5.main;

public class HW1 {
//1. Шахматная доска
//Создать программу для раскраски шахматной доски с помощью цикла.
//Создать двумерный массив String'ов 8х8. С помощью циклов задать элементам
//циклам значения B(Black) или W(White). Результат работы программы:
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W
//W B W B W B W B
//B W B W B W B W


    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) {
                    System.out.print("W B ");
                } else {
                    System.out.print("B W ");
                }
            }
            System.out.println();
        }


    }
}
