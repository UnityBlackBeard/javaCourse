package lesson_10;

import java.lang.invoke.StringConcatFactory;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class main {

    public static void main(String[] args) {
       //Set
        //в set не получится хранить повторяющиеся элементы
        //в Set все хранится в куче, какой будет индекс у элемента сразу не угадаешь

        //метож add()- добавление элемента

        HashSet<String> strings =new HashSet<>();
        strings.add("AAA");
        strings.add("BBB");
        strings.add("CCC");
        strings.add("DDD");
        strings.add("EEE");
        strings.add(null);

        //можно сделать обход коллекции циклом for each

        LinkedHashSet<String>strings1=new LinkedHashSet<>();
        strings1.add("AAA");
        strings1.add("BBB");
        strings1.add("CCC");
        strings1.add("DDD");
        strings1.add("EEE");
        strings1.add(null);

        // для обхода этой коллекции нужен класс Итератор
        //
        for(Iterator<String>iter=strings1.iterator(); iter.hasNext();){
            System.out.println(iter.next());
        }



    }
}
