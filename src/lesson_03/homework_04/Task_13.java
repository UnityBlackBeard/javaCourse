package lesson_03.homework_04;

import java.util.Arrays;
import java.util.Scanner;

public class Task_13 {

    //Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []a= new int[20];
        for (int i = 0; i <20 ; i++) {
            a[i]= in.nextInt();
        }
        Arrays.sort(a);
        for (int i = a.length-1; i>=0 ; i--) {
            System.out.println(a[i]);
        }
    }
}
