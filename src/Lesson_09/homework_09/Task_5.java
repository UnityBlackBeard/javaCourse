package Lesson_09.homework_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_5 {
//
// 1. Создай список строк.
//2. Добавь в него 5 строк с клавиатуры.
//3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
// 4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    ArrayList<String> list=new ArrayList<>();
    for (int i = 1; i <6 ; i++) {
        System.out.println("Введите строку №"+i );
        list.add(in.nextLine());

    }
    String temp;
    for (int i = 0; i <13 ; i++) {
      temp=list.remove(list.size()-1);
      list.add(0,temp);
    }
    for (int i = 0; i < list.size() ; i++) {
        System.out.println(list.get(i));
    }

}

}
