package lesson_10.homework_10;

import java.util.LinkedList;

public class Task_2 {

//    2
//
//            1. Создай список из слов "мама", "мыла", "раму".
//            2. После каждого слова вставь в список строку, содержащую слово "именно".
//            3. Вывести результат на экран, каждый элемент списка с новой строки.
        public static void main(String[] args) {
            LinkedList<String>list = new LinkedList<>();

            list.add("мама");
            list.add("мыла");
            list.add("раму");

            for (int i = 1; i < list.size()+1 ; i+=2) {
                list.add(i,"именно");
            }
            for (int i = 0; i < list.size() ; i++) {
                System.out.println(list.get(i));
            }


}
}
