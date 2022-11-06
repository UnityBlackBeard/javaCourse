package lesson_03.homework_04;

import java.util.Scanner;

public class Task_6 {

//    Ввести с клавиатуры строку name.
//    Ввести с клавиатуры дату рождения (три числа): y, m, d.
//
//    Вывести на экран текст:
//            "Меня зовут name.
//    Я родился d.m.y"
//
//    Пример вывода:
//    Меня зовут Вася.
//    Я родился 15.2.1988
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите имя");
    String name= in.next();
    StringBuilder date= new StringBuilder();
    System.out.println("Введите день месяц и год рождения");
    while(true){
        date.append(in.nextInt());
        date.append(".");
        if (date.length()>6) {
            break;
        }

    }
    System.out.println("Меня зовут "+name);
    System.out.println("я родился "+date);
}


    }



