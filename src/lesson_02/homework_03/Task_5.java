package lesson_02.homework_03;

import java.util.Scanner;

public class Task_5 {
//    Напиши программу, которая по номеру месяца должна определить время года (зима, весна, лето, осень) и вывести на экран.
//
//    Пример для номера месяца 2:
//    зима
//
//    Пример для номера месяца 5:
//    весна

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        String a = in.next();
        switch (Integer.parseInt(a)){
            case 1,2,12-> System.out.println("Зима");
            case 3,4,5-> System.out.println("Весна");
            case 6,7,8-> System.out.println("Лето");
            case 9,10,11-> System.out.println("Осень");
            default->
                System.out.println("нет такого месяца");
        }
    }


}
