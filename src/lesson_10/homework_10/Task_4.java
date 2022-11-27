package lesson_10.homework_10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_4 {
//
//    4
//
//            1. Введи с клавиатуры 10 слов в список строк.
//
//            2. Метод doubleValues должен удваивать слова по принципу:
//            "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
//
//            3. Выведи результат на экран, каждое значение с новой строки.
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    LinkedList<String>list=new LinkedList<>();
    for (int i = 0; i <10 ; i++) {
        list.add(in.nextLine());
    }
    list=doubleValue(list);
    for (String str: list
         ) {
        System.out.println(str);
    }



}
public static LinkedList<String> doubleValue(LinkedList<String> list){

    for (int i = 0; i <list.size() ; i++) {
        list.set(i,list.get(i)+", "+list.get(i)+", ");
    }

    return list;
}
}
