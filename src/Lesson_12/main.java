package Lesson_12;

import Lesson_12.additional.Day;

import java.util.HashMap;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        System.out.println("1. create collection HashMap");
        HashMap<String, Integer>table=new HashMap<>();
        System.out.println("---------------------------");
        table.put("динамо", 5);
        table.put("спартак", 3);
        table.put("цск", 1);
        System.out.println("----------------------------");
        System.out.println("2. повтор ключа");
        table.put("спартак", 6);
        System.out.println("при повторе ключа значение будет перезаписано");
        System.out.println("-------------------------------------");
        System.out.println("3. containsKey()- содержится ли такой ключ в мапе");
        System.out.println(table.containsKey("динамо"));
        System.out.println("----------------------------");
        System.out.println("4. обход по коллекции");
        for (Map.Entry<String, Integer>entry:table.entrySet()
             ) {
            System.out.println(entry.getKey()+" "+ entry.getValue());

        }
        System.out.println("-------------------------------------");
        System.out.println("5. Вернуть ключи нашей мапы");
        for (String key: table.keySet()
             ) {
            System.out.println(key+ "; ");
        }

        System.out.println("6. Вернуть значения нашей мапы");
        for (String key: table.keySet()
             ) {
            System.out.println(table.get(key));

        }

        Day today=Day.FRIDAY;
        System.out.println(today);
        Day [] days=Day.values(); //метод возвращает все значения
        for (Day d:days
             ) {
            System.out.println(d);
        }


    }
}
