package lesson_03.homework_04;

import java.util.Scanner;

public class Task_10 {

//   1. Создать массив на 10 чисел.
//   2. Ввести с клавиатуры 10 чисел и записать их в массив.
//   3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.


    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int [] a= new int[10];
        for (int i = 0; i <10 ; i++) {
            a[i]= in.nextInt();
        }
        for (int i= a.length-1; i >=0; i--) {
            System.out.println(a[i]);
        }
    }
}
