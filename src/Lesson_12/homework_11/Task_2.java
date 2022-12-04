package Lesson_12.homework_11;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_2  {
//    2
//
//    Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
//    Используй коллекции.
public static void main(String[] args) {
    HashMap<Integer,String> months= new HashMap<>();
    months.put(1,"January");
    months.put(2,"February");
    months.put(3,"March");
    months.put(4,"April");
    months.put(5,"May");
    months.put(6,"June");
    months.put(7,"July");
    months.put(8,"August");
    months.put(9,"September");
    months.put(10,"October");
    months.put(11,"November");
    months.put(12,"December");

    Scanner in = new Scanner(System.in);
    System.out.println("Enter month name");

    try {
        int num=in.nextInt();
        if(num<13&& num>0) {
            System.out.println(months.get(num) + " is the " + num + " month");
        }else{
            System.out.println("Wrong number");
        }

    }catch (InputMismatchException e){
        System.out.println("Введено что угодно, но не число");
    }


}
}
