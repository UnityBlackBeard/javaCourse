package lesson_10.homework_10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_1 {
//    1
//
//    Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    LinkedList<String> list= new LinkedList<>();

    for (int i = 0; i <5 ; i++) {
        list.add(in.nextLine());
    }

    list.remove(2);

    System.out.println(list.get(3)+" "+list.get(2)+" "+list.get(1)+" "+list.get(0));

}

}
