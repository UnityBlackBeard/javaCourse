package lesson_03.homework_04;

import java.util.Arrays;
import java.util.Scanner;

public class Task_11 {
//1. Создать массив на 20 чисел.
//2. Ввести в него значения с клавиатуры.
//3. Создать два массива на 10 чисел каждый.
//4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] x=new int[20];
        for (int i = 0; i <20 ; i++) {
            x[i]= in.nextInt();
        }
        int[] z= Arrays.copyOfRange(x,0,9);
        int[] y=Arrays.copyOfRange(x,10,x.length);
        for (int i = 0; i <10; i++) {
            System.out.println(y[i]);
        }


    }
}
