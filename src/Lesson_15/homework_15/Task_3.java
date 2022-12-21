package Lesson_15.homework_15;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Task_3 {
//    Введи с клавиатуры 30 чисел. Выведи 10-е и 11-е минимальные числа.
//            Пояснение:
//    Самое минимальное число - 1-е минимальное.
//    Следующее минимальное после него - 2-е минимальное.
//
//    Пример:
//            1 6 5 7 1 15 63 88
//    Первое минимальное - 1
//    Второе минимальное - 1
//    Третье минимальное - 5
//    Четвертое минимальное - 6

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        for (int i = 0; i <30 ; i++) {
            list.add(in.nextInt());
        }
        Collections.sort(list);
        System.out.println("10-е минимальное число "+list.get(9)+" 11-е минимальное число "+list.get(10));
    }
}
