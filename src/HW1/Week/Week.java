package HW1.Week;

import java.util.Scanner;

public class Week {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер дня недели");
        int day = scanner.nextInt();
        if (day <= 7 && day > 0) {

            switch (day) {
                case 1:
                    System.out.println("Понедельник ");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;


            }

        } else {
            System.out.println("Такой ввод невозможен");
        }


    }
}

