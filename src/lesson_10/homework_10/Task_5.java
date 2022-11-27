package lesson_10.homework_10;

import java.util.LinkedList;
import java.util.Scanner;

public class Task_5 {

//    5
//
//            1. Введи с клавиатуры 10 слов в список строк.
//            2. Определить, является ли список упорядоченным по возрастанию длины строки.
//            3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        LinkedList<String> list=new LinkedList<>();
        for (int i = 0; i <10 ; i++) {
            list.add(in.nextLine());
        }

        for (int i = 0; i < list.size()-1 ; i++) {
            if(list.get(i).length()>list.get(i+1).length()){
                System.out.println(list.get(i+1));
                break;
            }

            }

        }
    }

