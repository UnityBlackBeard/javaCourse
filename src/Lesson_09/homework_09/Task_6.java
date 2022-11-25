package Lesson_09.homework_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task_6 {
//
//    1. Создай список строк.
//2. Добавь в него 10 строчек с клавиатуры.
//3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
//    Если таких строк несколько, то должны быть учтены самые первые из них.
//4. Выведи на экран строку из пункта 3. Должна быть выведена одна строка.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        int maxValue=Integer.MIN_VALUE;
        int minValue=Integer.MAX_VALUE;
        for (int i = 0; i <10 ; i++) {
            System.out.println("Введите строку" );
            list.add(in.nextLine());
            if(list.get(i).length()>maxValue){
            maxValue=list.get(i).length();
            }
            if(list.get(i).length()<minValue){
                minValue=list.get(i).length();
            }

        }
        for (String str:list
             ) {
            if(str.length()==maxValue){
                System.out.println("раньше вошла самая длинная строка "+str);
                break;
            }
            if(str.length()==minValue){
                System.out.println("раньше вошла наименьшая строка "+str);
                break;
            }


        }




    }
}
