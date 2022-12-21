package Lesson_15.homework_15;

import java.util.HashMap;
import java.util.Scanner;

public class Task_2 {

    //    Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
//    Нужно сделать так, чтобы программа вводила с клавиатуры пары (число и строку) и сохраняла их в HashMap.
//
//    Ключевые требования:
//    Пустая строка - конец ввода данных.
//    Числа могут повторяться.
//    Строки всегда уникальны.
//    Введенные данные не должны потеряться!
//    Затем программа должна выводить содержание HashMap на экран.
//    Каждую пару - с новой строки.
//
//    Пример ввода:
//            1
//    Мама
//2
//    Рама
//1
//    Мыла
//
//    Пример вывода:
//            1 Мыла
//2 Рама
//1 Мама
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> tbl = new HashMap<>();
        String enterStr=" ";

        String vjuh="";
        Integer vjik=0;


        while (true) {

            enterStr = in.nextLine();
            if (!enterStr.isEmpty()) {
                try {
                    vjik = Integer.parseInt(enterStr);
                } catch (NumberFormatException e) {
                    System.out.println("непредвиденная неприятность");
                }
            } else
                break;

            enterStr = in.nextLine();
            if (!enterStr.isEmpty()) {
                vjuh = enterStr;
            } else
                break;

            tbl.put(vjuh,vjik);
        }

        for (String key : tbl.keySet()) {
            System.out.println(tbl.get(key) + " " + key);

        }

    }
}
