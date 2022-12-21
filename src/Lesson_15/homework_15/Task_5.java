package Lesson_15.homework_15;

import java.util.*;

public class Task_5 {
//    Задача: Пользователь вводит с клавиатуры список слов (и чисел).
//    Слова вывести в возрастающем порядке, числа - в убывающем.
//
//    Пример ввода:
//    Вишня
//          1
//    Боб
//          3
//    Яблоко
//          22
//           0
//    Арбуз
//
//    Пример вывода:
//    Арбуз
//          22
//    Боб
//          3
//    Вишня
//          1
//          0
//    Яблоко

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();

        ArrayList<String>str=new ArrayList<>();
        ArrayList<Integer>num=new ArrayList<>();

        //пока пусть будет 7
        for (int i = 0; i <7 ; i++) {
            list.add(in.next());
        }
        char[] isNum = new char[list.size()];

        for (String s :list) {
            try {
                num.add(Integer.parseInt(s));
                isNum[list.indexOf(s)] = 'n';
            }catch (NumberFormatException e) {
                str.add(s);
                isNum[list.indexOf(s)] = 's';
            }

        }
        Collections.sort(num, Collections.reverseOrder());

        Collections.sort(str);

        byte curInt = 0;
        byte curStr = 0;


        for (int i = 0; i < isNum.length ; i++) {
            if (isNum[i] == 'n') {
                System.out.println(num.get(curInt++));
            } else {
                System.out.println(str.get(curStr++));
            }

        }

    }
}
