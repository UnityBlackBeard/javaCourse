package lesson_03.homework_04;

import java.util.Scanner;

public class Task_4 {

//    Вводить с клавиатуры числа.
//    Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
//            -1 должно учитываться в сумме.
//
//    Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
//
//            while (true) {
//        int number = считываем число;
//        if (проверяем, что number -1)
//        break;
// }

    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int sum=0;
        int number=0;
        while(number!=-1){
            number= in.nextInt();
            sum+=number;
        }
        System.out.println(sum);
    }
}
