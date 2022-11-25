package Lesson_09;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestSpeed {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arrayList=new ArrayList<>(10);
        long start= System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            arrayList.add(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);

       // System.out.println(arrayList);

        LinkedList<Integer>list=new LinkedList<>();

        long start1= System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            list.add(i);
        }
        long end1=System.currentTimeMillis();
        System.out.println(end1-start1);
//        int a=10;
//        while(a>0){
//        //System.out.println("обратный отсчет, осталось "+ a);
//        Thread.sleep(1000);
//        a--;
        long start2= System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            arrayList.remove(i);
        }
        long end2=System.currentTimeMillis();
        System.out.println(end2-start2);

        long start3= System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            list.remove(i);
        }
        long end3=System.currentTimeMillis();
        System.out.println(end3-start3);

    }
}
