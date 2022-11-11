package Lesson_05.homework_05;

import Lesson_05.Contact;
import Lesson_05.PhoneBook;

import javax.swing.*;
import java.util.Scanner;

public class Task_1 {
    //сделать метод поиска, переименования и удаления контактов
    public static void main(String[] args) {
        System.out.println("Выберите действие" +
                "1- для поиска контакта" +
                "2-для редактирования" +
                "3-для удаления");
        Scanner in = new Scanner(System.in);
        String search = in.next();

        switch (Integer.parseInt(search)) {
            case 1 -> searchContact();
            case 2 -> EditContact();
            case 3 -> deleteContact();
            default -> System.out.println("Неверный параметр");
        }

    }





    public static void searchContact() {
        System.out.println("Введите номер или имя для поиска");
        Scanner in = new Scanner(System.in);
        String searchString = in.next();

        Contact contact;

        if (searchString.startsWith("+7")) {  //тут в идеале нужно больше условий на случай если номер вводится без кода страны
            contact = contactRequest(false, true, searchString);

        } else if (isAlpha(searchString)) {
            contact = contactRequest(true, false, searchString);

        } else {
            System.out.println("Неверный формат ввода");
        }
    }

    public static void EditContact() {
    }

    public static void deleteContact() {

    }

    public static Contact contactRequest(boolean n, boolean ph, String searchString){



       PhoneBook book=null;
        Contact contact=null;
        for (int i = 0; i <book.getContacts().length; i++) {
            contact=book.getContacts()[i];
            if(n){
                if(contact.getName().equals(searchString)){
                     return contact;
            }else if (ph){
                if(contact.getPhoneNumber().equals(searchString)){
                    return contact;
                }
                }
            }

        }
        return contact;
    }

    public static boolean isAlpha(String name) {
        return name.matches("[а-яА-Я]+") || name.matches("[a-zA-Z]+");
    }
}
