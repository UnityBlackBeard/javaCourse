package Lesson_09.homework_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_7 {
//
//    1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
//    Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
//            Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
//    Порядок объявления списков очень важен.
//1.1 Создай метод printList
//2. Метод printList должен выводить на экран все элементы списка с новой строки.
//            3. Используя метод printList выведи эти три списка на экран.
//    Сначала тот, который для x%3, потом тот, который для x%2, потом последний.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 1; i <21 ; i++) {
            System.out.println("Введите число №"+i );
            list.add(in.nextInt());

        }
        ArrayList<Integer> evenList=new ArrayList<>();
        ArrayList<Integer> unEvenList=new ArrayList<>();
        ArrayList<Integer> kuchaList=new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {

            if ((list.get(i) % 3 == 0) && (list.get(i) % 2 == 0)) {
                unEvenList.add(list.get(i));
                evenList.add(list.get(i));

            } else if (list.get(i) % 3 == 0) {
                unEvenList.add(list.get(i));

            } else if (list.get(i) % 2 == 0) {
                evenList.add(list.get(i));
            } else {
                kuchaList.add(list.get(i));
            }
        }

        printList(unEvenList);
        printList(evenList);
        printList(kuchaList);


    }

    public static void printList(ArrayList list){
        System.out.println("Массив ");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}
