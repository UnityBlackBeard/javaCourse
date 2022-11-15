package Lesson_05.Homework_optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {

//    2
//
//    Ввести 5 строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        String[]list=new String[5];
        for (int i = 0; i <list.length ; i++) {
            list[i]=in.next();
        }
        boolean isSorted=false;
        while(!isSorted) {
            isSorted=true;
            for (int i = 1; i < list.length; i++) {
                if (list[i].length() < list[i - 1].length()) {
                    String temp = list[i];
                    list[i] = list[i - 1];
                    list[i - 1] = temp;
                    isSorted=false;
                }
            }
        }
            System.out.println("min element "+list[0]+" max element "+(list[list.length-1]));
    }
}
