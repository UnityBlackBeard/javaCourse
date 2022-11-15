package Lesson_07.homework_06;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Goods bread=  new Goods("хлеб", 20.50, 10);
        Goods sausage=  new Goods("колбаса", 500.00, 12);
        Goods eggs=  new Goods("яйца", 49.99, 8);
        Goods matches=  new Goods("спички", 19.95, 5);
        Goods oil=  new Goods("масло", 201.00, 11);

        Goods [] goodsList1 =new Goods[]{bread,sausage,eggs};
        Goods [] goodsList2 =new Goods[]{bread,sausage,eggs,oil,matches};

        Category category1= new Category("high rate", goodsList1);
        Category category2= new Category("medium rate", goodsList2);

        System.out.println(category2.getCategoryTitle());

        Person person1 = new Person();
        person1.setFullName("Andrey Victorovich Petrov");
        person1.setAge(37);
        Person person2= new Person("Ivan Andreevich Strelcov",25);
        System.out.println("первый в списке "+person1.getFullName()+"\n"+"второй в списке "+person2.getFullName());
        person1.move();
        person2.talk();
    }
}
