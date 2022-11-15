package Lesson_05.Homework_optional;

import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {

//    5
//
//1. Считать 6 строк и заполнить ими массив strings.
//2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").

    public static void main(String[] args) {
        String [] array=new String[6];
        Scanner in= new Scanner(System.in);
        for (int i = 0; i <array.length ; i++) {
            array[i]= in.next();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        for (int i=0;i<array.length;i++){
            for (int k=i+1;k<array.length;k++) {
                if (k != i && array[k].equals(array[i])) {
                    array[i]=null;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}
