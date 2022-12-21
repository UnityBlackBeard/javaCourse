package Lesson_15.homework_15;

import java.util.*;

public class Task_1 {
//    Введи с клавиатуры 10 строчек и посчитай в них количество различных букв без учета регистра. Результат выведи на экран в алфавитном порядке.
//
//    Пример вывода:
//    а 5
//    б 8
//    в 3
//    г 7
//    д 0
//            ...
//    я 9
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//// Алфавит
//        List<Character> alphabet = Arrays.asList(
//                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
//                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
//                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
//                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');
//
//// Ввод строк
//        ArrayList<String> list = new ArrayList<String>();
//        for (int i = 0; i < 10; i++) {
//            String line = reader.readLine();
//            list.add(line.toLowerCase());
//        }
//
//// напишите тут ваш код
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list=new ArrayList<String>();
        for (int i = 0; i <10 ; i++) {
            String line=in.nextLine();
            list.add(line.toLowerCase());

        }
        Collections.sort(list);
        for (String s:list
             ) {
            System.out.println(s+" "+s.length());
        }
    }
}
