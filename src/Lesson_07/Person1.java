package Lesson_07;

public class Person1 implements PeopleInterface {

    @Override
    public void run() {
        System.out.println("running");
    }

    @Override
    public void jump() {
        System.out.println("jumping");
    }

    @Override
    public void cry() {
        System.out.println("crying");
    }

    @Override
    public void suffer() {
        System.out.println("suffering");
    }
}
