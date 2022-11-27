package lesson_10.homework_10;

import java.util.ArrayList;
import java.util.ListIterator;

public class Task_3 {
//
//    3
//
//            1. Создай список слов, заполни его самостоятельно.
//2. Метод fix должен:
//            2.1. удалять из списка строк все слова, содержащие букву "р"
//            2.2. удваивать все слова содержащие букву "л".
//            2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
//            2.4. с другими словами ничего не делать.
//
//    public static void main(String[] args) {
//        ArrayList<String> strings = new ArrayList<String>();
//        strings.add("роза");
//        strings.add("лоза");
//        strings.add("лира");
//        strings = fix(strings);
//
//        for (String string : strings) {
//            System.out.println(string);
//        }
//    }
//
//    public static ArrayList<String> fix(ArrayList<String> strings) {
////напишите тут ваш код
//        return null;
//    }


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("арфа");
        list.add("скрипка");
        list.add("виолончель");
        list.add("контрабас");
        list.add("балалайка");

        list = fix(list);

        for (String str : list
        ) {
            System.out.println(str);
        }

    }

    //2. Метод fix должен:
//            2.1. удалять из списка строк все слова, содержащие букву "р"
//            2.2. удваивать все слова содержащие букву "л".
//            2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
//            2.4. с другими словами ничего не делать.


    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i <strings.size() ; i++) {
            if (!(strings.get(i).contains("р") && strings.get(i).contains("л"))) {

                if (strings.get(i).contains("р")) {
                    //strings.remove(strings.indexOf(str));
                    strings.set(i, "");

                } else if (strings.get(i).contains("л")) {
                    strings.set(i,strings.get(i)+strings.get(i));

                }


            }
        }
        ListIterator<String> iter=strings.listIterator();
        while(iter.hasNext()){
            if(iter.next().isEmpty()){
                iter.remove();

            }
        }


        return strings;
    }

}