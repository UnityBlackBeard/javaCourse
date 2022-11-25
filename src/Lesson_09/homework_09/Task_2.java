package Lesson_09.homework_09;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_2 {
//    1. Создай список строк.
//2. Считай с клавиатуры 5 строк и добавь в список.
//3. Используя цикл, найди самую длинную строку в списке.
//4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list=new ArrayList<>();
        for (int i = 1; i <6 ; i++) {
            System.out.println("Введите строку №"+i );
            list.add(in.nextLine());
        }
        ArrayList<String> maxList=new ArrayList<>();
        maxList.add("");
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).length()>=maxList.get(0).length()){
                if (list.get(i).length()>maxList.get(0).length()) {
                    maxList.clear();
                    maxList.add(list.get(i));
                }
                else {
                    maxList.add(list.get(i));
                }
            }
        }
        System.out.println(maxList);
    }
}
