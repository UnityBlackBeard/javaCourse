package lesson_02.homework_03;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Task_2 {
//    Работа светофора для пешеходов запрограммирована следующим образом:
//    в начале каждого часа в течение трех минут горит зелёный сигнал,
//    затем в течение одной минуты - жёлтый,
//    а потом в течение одной минуты - красный,
//    затем опять зелёный горит три минуты и т. д.
//    Подать программе вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
//    Определить, сигнал какого цвета горит для пешеходов в этот момент.
//    Результат вывести на экран в следующем виде:
//            "зелёный" - если горит зелёный цвет,
//"жёлтый" - если горит жёлтый цвет,
//"красный" - если горит красный цвет.
//
//    Пример для числа 2.5:
//    зелёный
//
//    Пример для числа 3:
//    жёлтый
//
//    Пример для числа 4:
//    красный
//
//    Пример для числа 5:
//    зелёный

    public static void main(String[] args) {

        String yellow="Желтый";
        String red="Красный";
        String green="Зеленый";

        Scanner in = new Scanner(System.in);
        System.out.println("сколько минут прошло?");
        double t= in.nextDouble();

if (t>60.00) {
    int q = (int) (t/60);
    t=abs(t-(60*q));
        }
//а вот тут конечно КВН! ну допустим что в минуте будет 100 секунд и дробная часть представляет секунды
//раз циклы использовать нельзя, а я свято уверен что смысл задачи заключается именно в "и т.д" фразы "затем опять зелёный горит три минуты и т. д."
//иначе какой смысл написать три интервала, то есть после 5й минуты всегда зеленый
//хотя по-хорошему нужно этот код продумать тщательнее...
        if ((t< 3.00) ||
                (t>5.00 && t<8.00)   ||
                (t>10.00 && t<13.00) ||
                (t>15.00 && t<18.00) ||
                (t>20.00 && t<23.00) ||
                (t>25.00 && t<28.00) ||
                (t>30.00 && t<33.00) ||
                (t>35.00 && t<38.00) ||
                (t>40.00 && t<43.00) ||
                (t>45.00 && t<48.00) ||
                (t>50.00 && t<53.00) ||
                (t>55.00 && t<58.00)) {
            System.out.println(green);
        } else if (
                (t>=3.00) && (t<4.00) ||
                        (t>=8.00) && (t<9.00) ||
                        (t>=13.00) && (t<14.00) ||
                        (t>=18.00) && (t<19.00) ||
                        (t>=23.00) && (t<24.00) ||
                        (t>=28.00) && (t<29.00) ||
                        (t>=33.00) && (t<34.00) ||
                        (t>=38.00) && (t<39.00) ||
                        (t>=43.00) && (t<44.00) ||
                        (t>=48.00) && (t<49.00) ||
                        (t>=53.00) && (t<54.00) ||
                        (t>=58.00) && (t<59.00)) {
            System.out.println(yellow);

        } else if (
                ((t>=4.00) && (t<=5.00)) ||
                        ((t>=9.00) && (t<=10.00)) ||
                        ((t>=14.00) && (t<=15.00)) ||
                        ((t>=19.00) && (t<=20.00)) ||
                        ((t>=24.00) && (t<=25.00)) ||
                        ((t>=29.00) && (t<=30.00)) ||
                        ((t>=34.00) && (t<=35.00)) ||
                        ((t>=39.00) && (t<=40.00)) ||
                        ((t>=44.00) && (t<=45.00)) ||
                        ((t>=49.00) && (t<=50.00)) ||
                        ((t>=54.00) && (t<=55.00)) ||
                        ((t>=59.00) && (t<=60.00))) {
            System.out.println(red);
        }

    }



}
