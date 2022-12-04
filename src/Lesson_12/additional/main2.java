package Lesson_12.additional;

import java.util.ArrayList;
import java.util.List;

public class main2 {
    public static void main(String[] args) {
        Specialist specialist1= new Specialist("Vasiliy", 10000, Speciality.DEVELOPER);
        Specialist specialist2= new Specialist("Viktor", 23000, Speciality.DEVOPS);
        Specialist specialist3= new Specialist("Alexander", 100000, Speciality.PROJECTMANAGER);
        Specialist specialist4= new Specialist("Igor", 12000, Speciality.DEVELOPER);
        Specialist specialist5= new Specialist("Nikolay", 50000, Speciality.DEVELOPER);
        Specialist specialist6= new Specialist("John", 5000, Speciality.DEVELOPER);


        List<Specialist> specs = new ArrayList<>();
        specs.add(specialist1);
        specs.add(specialist2);
        specs.add(specialist3);
        specs.add(specialist4);
        specs.add(specialist5);
        specs.add(specialist6);


       // Util.oldFindByName(specs,"Vas");
        Util.newFindByName(specs,"Nik").forEach(x-> System.out.println(x));


    }
}
