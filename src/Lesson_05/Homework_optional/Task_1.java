package Lesson_05.Homework_optional;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_1 {

//    1
//
//    Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//    Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
//
//    Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//    Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
//    Программа выводит слова на экран.

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        //String var=in.next();
        ArrayList<String> list=new ArrayList<>();

        while(true){
            String var=in.nextLine();
            if(!(var.isEmpty())) {

                list.add(var);
            }else{break;}
            System.out.println("press enter to continue");


        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toUpperCase());
            if(list.get(i).length()%2==0){
                System.out.println(list.get(i)+list.get(i));
            }else{
                System.out.println(list.get(i)+list.get(i)+list.get(i));
            }

   }

    }
}
