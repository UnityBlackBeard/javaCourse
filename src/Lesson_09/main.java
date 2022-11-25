package Lesson_09;

import java.util.ArrayList;


public class main {

    public static void main(String[] args) {
        int [] array = new int[10];

        //1. процесс создания коллекции и добавления в нее элементов
        ArrayList<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(22);
        list.add(15);
        list.add(44);

        //2.метод add - с указанием индекса
        list.add(2,3);

        System.out.println(list);

        //3. метод set()- затирает значение по индексу,
        list.set(3,99);
        System.out.println(list);

        //4.метод size() - возвращает размер коллекции
        System.out.println(list.size());

        //5. метод  get()- получить элеменнт по индексу
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        for (Integer c:
            list ) {
            ;

        }
        System.out.println(list);

        //6. toArray - преобразование коллекции в массив
        Object [] objects= list.toArray();
        for (Object o : objects
             ) {
            System.out.println(o+" ,");
        }
        System.out.println();

        //7. метод contains- вернет true или false  если в коллекции есть какой-то определенный элемент
        System.out.println(list.contains(11));

        //8. метод addAll() - добавить все элементы в новую коллекцию из старой
        ArrayList<Integer> copyList = new ArrayList<>();
        copyList.addAll(list);

        //9. метод remove - удаление элемента по определенному индексу
        System.out.println("before method remove"+ list);
        list.remove(0);
        System.out.println("after"+list);

        //10. метод возвращает индекс объекта массива
        System.out.println(list.indexOf(99));

       //12. проверка пустой лист или нет isEmpty()
        System.out.println(list.isEmpty());
        //13.clear()- удаление всех элементов коллекциии
        list.clear();
        System.out.println(list);

    }
}
