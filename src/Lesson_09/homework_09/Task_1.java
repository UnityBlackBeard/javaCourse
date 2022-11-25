package Lesson_09.homework_09;

import java.util.ArrayList;

public class Task_1 {
//
//            1. Создай список строк.
//2. Добавь в него 5 различных строк.
//            3. Выведи его размер на экран.
//4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();

        list.add("String1");
        list.add("String2");
        list.add("String3");
        list.add("String4");
        list.add("String5");
        System.out.println("размер списка "+list.size());
        for (String c:
             list) {
            System.out.println(c);

        }
    }
}
