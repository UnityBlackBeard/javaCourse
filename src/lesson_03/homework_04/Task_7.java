package lesson_03.homework_04;

import java.util.Scanner;

public class Task_7 {

//   1. Создать массив на 10 строк.
//   2. Ввести с клавиатуры 8 строк и сохранить их в массив.
//   3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String []array0=new String[10];
        for (int i = 0; i <8 ; i++) {
            array0[i]= scan.next();
        }

        for (int i= array0.length-1; i >=0; i--) {
            System.out.println(array0[i]);
       }
    }
}
