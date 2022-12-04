package Lesson_12.homework_11;

import java.util.HashMap;
import java.util.Map;

public class Task_1 {
//    1
//
//            1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
//            2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
//            3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
//            4. Вывести содержимое Map на экран.
//

    public static void main(String[] args) {
        HashMap<String,String> dictionary= new HashMap<>();
        dictionary.put("Иванов", "Петр");
        dictionary.put("Петров", "Иван");
        dictionary.put("Сидоров", "Иван");
        dictionary.put("Иванов", "Сергей");
        dictionary.put("Сергеев", "Алексей");
        dictionary.put("Иванова", "Ольга");
        dictionary.put("Петрова", "Елена");
        dictionary.put("Селиванов", "Андрей");
        dictionary.put("Андреев", "Семен");
        dictionary.put("Андреев", "Алексей");

        for (Map.Entry<String,String>entry:dictionary.entrySet()
             ) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }




    }
}
