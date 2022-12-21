package Lesson_12.additional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

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

//        String login =null;
//        if(login!=null){
//            System.out.println(login.length());
//        }
//        Scanner scanner =new Scanner(System.in);
//        login=scanner.nextLine();
//        login=null;
        Optional <String> opt=Optional.ofNullable("HelloWorld");
        opt.ifPresent(login-> System.out.println(login));

        String nullName=null;
//        String name =Optional.ofNullable(nullName).orElse("пользователь");
//        System.out.println("привет "+name);

        String name =Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);


       // Util.oldFindByName(specs,"Vas");
      //  Util.newFindByName(specs,"Nik").forEach(x-> System.out.println(x));
      //  Util.oldSortByName(specs)
           // Util.newSortByName(specs).forEach(System.out::println);
            Util.matchAllSpecialistsSalaryMoreThanTenThousands(specs);
    }
}
