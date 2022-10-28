package lesson_02.homework_02;



public class Task_3 {
    public static void main(String[] args) {
        //Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
        //насколько быстрее голодный Вася съедает один банан?
        //Вывести на консоль
        System.out.println("на целых 2 минуты быстрее!");
        System.out.println("Но давайте проверим...");
        //мысль в следующем
        //если за 9 минут он уничтожает 3 банана, узнаем сколько времени уходит на один
        int hungTime = 9; //рекорд времени голодного Васи
        int babanas= 3; //количество бананов

        int hungOneTime = hungTime/babanas;
        System.out.println("На ликвидацию ОДНОГО банана в ГОЛОДНОМ состоянии уходит "+hungOneTime+" минуты");

        //в сытом состоянии ему потребовалось 15 минут на ТОЖЕ количество бананов
        //найдем время на один банан для этого условия

        int fullTime= 15;

        int fullOneTime =fullTime/ babanas;
        System.out.println("На ликвидацию ОДНОГО банана в СЫТОМ состоянии уходит "+fullOneTime+" минут");

        int diff= fullOneTime-hungOneTime;
        System.out.println("Разница составит "+diff+ " минуты");

        double diffPerc=((double)diff*100)/(double)hungOneTime;
        System.out.println("Следовательно голодный Вася съедает один банан на "+diff+" минуты ИЛИ где-то на "+diffPerc +"% быстрее");
        System.out.println("ч.т.д.");

    }
}
