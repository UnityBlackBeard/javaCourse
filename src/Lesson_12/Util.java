package Lesson_12;

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
        list.stream().filter(x->x.getName().startsWith("Vas")).collect(Collectors.toList());
        return list;
    }


}
