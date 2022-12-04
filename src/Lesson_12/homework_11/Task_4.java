package Lesson_12.homework_11;

import java.util.HashMap;
import java.util.Map;

public class Task_4 {
//    4
//
//    Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
//    арбуз - ягода,
//    банан - трава,
//    вишня - ягода,
//    груша - фрукт,
//    дыня - овощ,
//    ежевика - куст,
//    жень-шень - корень,
//    земляника - ягода,
//    ирис - цветок,
//    картофель - клубень.
//    Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//
//            Пример вывода (тут показана только одна строка):
//    картофель - клубень

    public static void main(String[] args) {
        Map<String, String>list=new HashMap<>();
        list.put("арбуз","ягода");
        list.put("банан","трава");
        list.put("вишня","ягода");
        list.put("груша","фрукт");
        list.put("дыня","овощ");
        list.put("ежевика","куст");
        list.put("жень-шень","корень");
        list.put("земляника","ягода");
        list.put("ирис","цветок");
        list.put("картофель","клубень");

        for (String s: list.keySet()
             ) {
            System.out.println(s+" - "+list.get(s));
        }
    }
}
