package Lesson_15.homework_15;

import java.util.Scanner;

public class Task_4 {

//    Написать программу, которая вводит с клавиатуры строку текста.
//    Программа должна вывести на экран две строки:
//            1. первая строка содержит только гласные буквы из введённой строки.
//2. вторая - только согласные буквы и знаки препинания из введённой строки.
//    Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
//    Пример ввода:
//    Мама мыла раму.
//
//    Пример вывода:
//    а а ы а а у
//    М м м л р м .
//
//
//    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
//
//    public static void main(String[] args) throws Exception {
////напишите тут ваш код
//    }
//
//    // метод проверяет, гласная ли буква
//    public static boolean isVowel(char character) {
//        character = Character.toLowerCase(character); // приводим символ в нижний регистр - от заглавных к строчным буквам
//        for (char vowel : vowels) { // ищем среди массива гласных
//            if (character == vowel) {
//                return true;
//            }
//        }
//        return false;
//    }
public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static void main(String[] args)throws Exception {

            //напишите тут ваш код
          Scanner in =new Scanner(System.in);
            String vLet = "";
            String cLet = "";
            String newStr="";

            String str = in.nextLine();
            char chr;
            newStr=str.replaceAll("\\s","");

            for (int i = 0; i < newStr.length(); i++) {
                chr = newStr.charAt(i);

                if (isVowel(chr)) {
                    vLet = vLet + chr +" ";
                } else {
                    cLet = cLet + chr +" ";
                }
            }

            System.out.println(vLet);
            System.out.println(cLet);
        }

        // метод проверяет, гласная ли буква
        public static boolean isVowel(char character) {
            character = Character.toLowerCase(character); // приводим символ в нижний регистр - от заглавных к строчным буквам
            for (char vowel : vowels) { // ищем среди массива гласных
                if (character == vowel) {
                    return true;
                }
            }
            return false;
        }
    }

