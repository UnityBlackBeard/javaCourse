package Lesson_09.homework_09;


import java.util.LinkedList;
import java.util.Scanner;

public class Task_4 {

//    1. Создай список строк в методе main.
//    2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
//3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        Scanner in = new Scanner(System.in);


        //ЗААААААААЧЕЕЕЕЕЕЕЕЕМ?????????????????
        //ЗАЧЕМ ДОБАВЛЯТЬ В НАЧАЛО???? ЗААААААЧЕМ????????
        for (int i = 0; i<10 ; i++) {
            list.addFirst(in.nextLine());
        }

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }


    }
}
