package lesson_03.homework_04;

import java.util.Arrays;
import java.util.Scanner;

public class Task_8 {
//    1.1. Создай массив на 10 чисел
//1.2. Считай с консоли 10 чисел и заполни ими массив
//2. Найти максимальное число из элементов массива

    public static void main(String[] args) {
        int[]a=new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        int maxN=a[a.length-1];
        System.out.println("максимальное число "+maxN);
    }
}
