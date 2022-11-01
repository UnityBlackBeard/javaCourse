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
        int monthNumber=Integer.parseInt(a);
        switch (monthNumber){
            case 1: case 2: case 12:
                System.out.println("Зима");
                break;
            case 3: case 4: case 5:
                System.out.println("Весна");
                break;
            case 6: case 7: case 8:
                System.out.println("Лето");
                break;
            case 9: case 10: case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("нет такого месяца");


        }
    }


}
