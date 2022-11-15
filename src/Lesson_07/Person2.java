package Lesson_07;

public class Person2 implements PeopleInterface{

    @Override
    public void run() {
        System.out.println("isnt running");
    }

    @Override
    public void jump() {
        System.out.println("isnt jumping");
    }

    @Override
    public void cry() {
        System.out.println("isnt crying");
    }

    @Override
    public void suffer() {
        System.out.println("isnt suffering");
    }
}
