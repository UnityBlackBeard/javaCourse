package lesson_03.homework_04;

import java.util.Scanner;

public class Task_9 {

//    1. Создать массив на 10 строк.
//2. Создать массив на 10 чисел.
//3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//            4. В каждую ячейку массива чисел записать длину строки из массива строк,
//    индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.

    public static void main(String[] args) {
        String []arrayS=new String[10];
        int [] arrayI=new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i <10 ; i++) {
         arrayS[i]= in.next();
        }
        for (int i = 0; i <10 ; i++) {
            arrayI[i]=arrayS[i].length();

        }
        for (int i = 0; i <10 ; i++) {
            System.out.print(arrayI[i]+" ");
        }

    }
}
