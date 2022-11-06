package lesson_03.homework_04;

import java.util.Scanner;

public class Task_1 {


//    Ввести с клавиатуры два числа m и n.
//    Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
//
//    Пример: m=2, n=4
//            8888
//            8888

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите первое число ");
        int m=Integer.parseInt(in.next());
        System.out.println("Введите второе число");
        int n=Integer.parseInt(in.next());
        StringBuilder row= new StringBuilder();

        for (int i = 0; i < n; i++) {
            row.append("8");
        }
        for (int i = 0; i < m; i++) {
            System.out.println(row);
        }
    }
}
