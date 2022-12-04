package Lesson_12.additional;

import Lesson_12.additional.Specialist;

import java.util.List;
import java.util.stream.Collectors;

public class Util {
    public static void oldFindByName(List<Specialist>list, String name){

        for(Specialist s:list){
            if(s.getName().startsWith(name)){
                System.out.println(s);
            }

        }

    }

    public static List<Specialist> newFindByName(List<Specialist>list, String name){
        //было
        //list.stream().filter(x->x.getName().startsWith(name)).collect(Collectors.toList());
        //стало
        List<Specialist>list1= list.stream().filter(x->x.getName().startsWith(name)).collect(Collectors.toList());
        return list1;
    }


}
