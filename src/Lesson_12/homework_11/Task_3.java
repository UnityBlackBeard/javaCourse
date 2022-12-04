package Lesson_12.homework_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task_3 {
//    3
//
//    Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
//    Новая задача: Программа должна работать не с номерами домов, а с городами:
//
//    Пример ввода:
//    Москва
//            Ивановы
//    Киев
//            Петровы
//    Лондон
//            Абрамовичи
//
//    Лондон
//
//    Пример вывода:
//    Абрамовичи
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        Map<String, String> map = new HashMap<>();
//        while (true) {
//            String city = reader.readLine();
//            if (city.isEmpty()) {
//                break;
//            }
//            String family = reader.readLine();
//
//            map.put(city, family);
//        }
//
//        String city = reader.readLine();
//
//        if (map.containsKey(city)) {
//            String familyName = map.get(city);
//            System.out.println(familyName);
//        }
//    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, String> map = new HashMap<>();

        //UnityBlackBeard string replaced
        //while (true) {
        int count=0;
        while(count<5){
            //UnityBlackbeard string added
            System.out.println("Введите номер дома ");
            //----
            int houseNumber = Integer.parseInt(reader.readLine());
            if (houseNumber<0) {

            }
            //UnityBlackbread string added
            System.out.println("Введите фамилию семью");
            //----
            String family = reader.readLine();

            map.put(houseNumber, family);
            count++;

        }
        //UnityBlackBeard string added
        System.out.println("Введите номер дома для поиска");
        //----
        int houseNumber = Integer.parseInt(reader.readLine());

        if (map.containsKey(houseNumber)) {
            String familyName = map.get(houseNumber);
            System.out.println(familyName);
        }
    }


}
