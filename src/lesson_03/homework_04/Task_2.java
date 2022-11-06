package lesson_03.homework_04;

public class Task_2 {

//    Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
//
//    Пример вывода на экран:
//            8
//            88
//            888
//            8888
//            88888
//            888888
//            8888888
//            88888888
//            888888888
//            8888888888


    public static void main(String[] args) {

        StringBuilder row= new StringBuilder();
        for (int i = 0; i < 10; i++) {
            row.append("8");
            System.out.println(row);
        }
    }
}
