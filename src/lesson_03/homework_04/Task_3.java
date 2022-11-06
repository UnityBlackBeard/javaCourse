package lesson_03.homework_04;

import java.util.Scanner;

public class Task_3 {

//    Ввести с клавиатуры три числа, вывести на экран среднее из них.
//    Т.е. не самое большое и не самое маленькое.
//    Если все числа равны, вывести любое из них.

    //тут я не догнал как использовать цикл, точнее сказать не увидел возможности использования

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Введите первое число");
        int a= in.nextInt();
        System.out.println("Введите второе число");
        int b= in.nextInt();
        System.out.println("Введите третье число");
        int c= in.nextInt();


        int median = Math.max(Math.min(a, b), Math.min(Math.max(a, b), c));


        if (a==b && b==c){
            System.out.println(a);
        }else {
            System.out.println(median);
        }
    }
}


