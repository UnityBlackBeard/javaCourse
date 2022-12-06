package Lesson_12.additional;

import Lesson_12.additional.Specialist;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
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

    public static List<Specialist> oldSortByName(List<Specialist> list){
        int a=0;
        for (Specialist s:list
             ) {
            if(s.getName().length()>a){
                Specialist specialist=s;
                list.remove(s);
                list.add(0,specialist);
                a=s.getName().length();
            }
        }
        return list;
    }
    public static List<Specialist> newSortByName(List<Specialist>list){

        return list.stream()
                .sorted(Comparator.comparing(specialist->specialist.getName()))
                .collect(Collectors.toList());
    }

    public static Map<Speciality, List<Specialist>> groupingBySpeciality(List<Specialist>list){

        return list.stream()
                .collect(Collectors.groupingBy(s->s.getSpeciality()));
    }
    public  static boolean matchAllSpecialistsAreDevops(List <Specialist> list){
    return list.stream()
            .allMatch(specialist->specialist.getSpeciality().equals(Speciality.DEVOPS));
    }

    public static boolean matchAllSpecialistsSalaryMoreThanTenThousands(List<Specialist>list){
        return list.stream()
                .noneMatch(specialist -> specialist.getSalary().compareTo(10000)<0);
    }


}
