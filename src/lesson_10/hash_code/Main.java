package lesson_10.hash_code;

import lesson_10.ReverseInteger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
/**
 * Блок теории 3 HashCode
 * Ключевое слова Hash - означает каличие в коллекции механизма хэширования
 * Представьте что вы коллекционер монет и у Вас уже есть коллекция монет из 19 000 штук.
 * Вом предложили новую монету, кок быстро проверить есть ли ток я же у вос или нет, ведь
 в коллекции все монеты должны быть уникальный. Можно быстро проверить по страном,
 по номиналу, по диаметру, год выпуска.
 * То есть нужны характеристики которые есть у каждой монеты. * И характеристика должна быть
 объективно определяемой, например цвет не пойдет.
 * Совокупность хароктеристик может дать числовой код, который и покажет номер ячейки.
 * При этом у двух разных монеток могут быть разные хэшкоды, но у монет будут еще отличия,
 которые не вошли * в хэшкод, например цвет. Поэтому после отроботки методо .hashcode должен
 отроботать метод .equals u * окончательно сравнить монеты и вернуть boolean означающий есть
 такая монета в коллекции или нет.
 * */

    Coin coin1=new Coin(10, 20.5, "Russia", 1997) ;
        Coin coin2=new Coin(20, 21.5, "Brazil", 1991) ;
        Coin coin3=new Coin(50, 30.5, "Belarus", 2005) ;
        Coin coin4=new Coin(7, 25.5, "Iran", 2015) ;
        Coin coin5=new Coin(10, 20.5, "Russia", 1997) ;

        HashSet<Coin>coinCollection=  new HashSet<>();
        coinCollection.add(coin1);
        coinCollection.add(coin2);
        coinCollection.add(coin3);
        coinCollection.add(coin4);
        coinCollection.add(coin5);

        for (Coin n:coinCollection
             ) {
            System.out.println(n);

        }


       // System.out.println();
        TreeSet<Integer>treeSet= new TreeSet<>(new ReverseInteger());
        treeSet.add(111);
        treeSet.add(222);
        treeSet.add(333);
        treeSet.add(777);
        treeSet.add(1);
        treeSet.add(777);

        TreeSet<String>treeSet1= new TreeSet<>();
        treeSet1.add("AAA");
        treeSet1.add("BBB");
        treeSet1.add("CCC");
        treeSet1.add("DDD");
        treeSet1.add("EEE");
        treeSet1.add("aaa");

        System.out.println();


    }
}

