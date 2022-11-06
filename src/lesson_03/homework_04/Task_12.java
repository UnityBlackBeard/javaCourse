package lesson_03.homework_04;

import java.util.Arrays;
import java.util.Scanner;

public class Task_12 {
//    Создать массив на 20 чисел.
//    Заполнить его числами с клавиатуры.
//    Найти максимальное и минимальное числа в массиве.
//    Вывести на экран максимальное и минимальное числа через пробел.

    public static void main(String[] args) {
        int[] array0=new int [20];
        Scanner scan= new Scanner(System.in);
        for (int i = 0; i <20 ; i++) {
            array0[i]=scan.nextInt();
        }
        Arrays.sort(array0);
        int minN=array0[0];
        int maxN= array0[array0.length-1];
        System.out.println(maxN+" "+minN);
    }
}
