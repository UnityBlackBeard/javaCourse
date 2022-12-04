package Lesson_11;

public class main1 {
    public static void main(String[] args) {
        Dog dog=new Dog("Шарик");
        dog.putCollar();
        dog.putLeash();
        dog.putMuzzle();

        try {
            dog.walk();
        } catch (DogIsNotReadyToWalkException e) {
            e.printStackTrace();
        }
    }
}
