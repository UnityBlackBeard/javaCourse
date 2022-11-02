package lesson_02.homework_03;

import java.util.Scanner;

public class Task_4 {
//    Написать программу, которая будет проверять число, которое мы подадим ей.
//    Если число положительное, то увеличить его в два раза.
//    Если число отрицательное, то прибавить единицу.
//    Если введенное число равно нулю, необходимо вывести ноль.
//    Вывести результат в консоль..
public static void main(String[] args) {
    System.out.println("Введите число");
    Scanner in = new Scanner(System.in);
    int number = in.nextInt();
    if (number>0){
        number*=2;
        System.out.println(number);
    } else if (number<0) {
        number++;
        System.out.println(number);
    }else{
        System.out.println(number);
    }

}

}
