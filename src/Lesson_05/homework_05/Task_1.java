package Lesson_05.homework_05;

import Lesson_05.Contact;
import Lesson_05.PhoneBook;


import java.util.Scanner;

public class Task_1 {
    //сделать метод поиска, переименования и удаления контактов
    public static void main(String[] args) {

        Contact ivan = new Contact("Ivan", "+79591122336","mail@mail.ru");
        Contact Vasya = new Contact("Vasya", "+79591122458","mailq@mail.ru");
        Contact olga = new Contact("Olga", "+79591127456","maila@mail.ru");
        Contact finist = new Contact("Finist", "+79599988546","mailf@mail.ru");
        Contact boris = new Contact("Boris", "+79599631245","mailc@mail.ru");

        PhoneBook phoneBook=new PhoneBook();
        phoneBook.addContact(ivan);
        phoneBook.addContact(Vasya);
        phoneBook.addContact(olga);
        phoneBook.addContact(finist);
        phoneBook.addContact(boris);

        String search;
        int index=-1;

        do {

            System.out.println("Выберите действие \n" +
                    "1- для поиска контакта \n" +
                    "2-для редактирования \n" +
                    "3-для удаления \n" +
                    "0-для выхода");
            Scanner in = new Scanner(System.in);
            search = in.next();

            switch (Integer.parseInt(search)) {
                case 0 -> {
                }
                case 1 -> index = searchContact(phoneBook);
                case 2 -> EditContact(phoneBook.contacts[index]);
                case 3 -> deleteContact(phoneBook, index);
                default -> System.out.println("Неверный параметр");
            }
        }while (Integer.parseInt(search)!=0);

    }


    public static int searchContact(PhoneBook pb) {

        System.out.println("Введите номер или имя для поиска");
        Scanner in = new Scanner(System.in);
        String searchString = in.next().toLowerCase();

        int contactIndex = 0;

try {
    if (searchString.startsWith("+7")) {  //тут в идеале нужно больше условий на случай если номер вводится без кода страны
        contactIndex = contactRequest(false, true, pb, searchString);

    } else if (isAlpha(searchString)) {
        contactIndex = contactRequest(true, false, pb, searchString);

    } else {
        System.out.println("Неверный формат ввода");
    }


    getContactProperties(pb.contacts[contactIndex]);
}  catch(NullPointerException e)
{
    System.out.print("Все накрылось болтом, контакта или не было или он удален. Шеф, все пропало!");
}

        return contactIndex;
    }

    public static void EditContact(Contact ct) {

        System.out.println("Введите свойство для изменения \n" +
                "1- Имя \n" +
                "2-номер \n" +
                "3-мыло");
        Scanner in = new Scanner(System.in);
        int paramName = in.nextInt();

        System.out.println("Введите новое значение свойства");
        String paramValue = in.next();

        switch (paramName) {
            case 1 -> {
                ct.setName(paramValue);
                System.out.println("новое имя контакта: "+paramValue);
            }
            case 2 -> ct.setPhoneNumber(paramValue);
            case 3 -> ct.setEmail(paramValue);
            default -> System.out.println("Неверный параметр");
        }
        if(paramName<4){
            getContactProperties(ct);
        }

    }

    public static void deleteContact(PhoneBook pb, int index) {

        pb.contacts[index] = null;
        System.out.println("Контакт удален");
    }

    public static void getContactProperties(Contact ct) {
        System.out.println("Перечень свойств контакта "+ct.getName()+": \n телефон "+
                ct.getPhoneNumber()+"\n мыло "+ct.getEmail());
    }

    public static int contactRequest(boolean n, boolean ph, PhoneBook pb, String searchString){


        int res=0;

        for (int i = 0; i <pb.contacts.length; i++) {
             Contact contact=pb.contacts[i];
            if(n){
                if(contact.getName().toLowerCase().equals(searchString)){
                     res = i;
                     break;
            }else if (ph){
                if(contact.getPhoneNumber().equals(searchString)){
                    res =i;
                    break;
                }
                }
            }
        }
        return res;
    }

    public static boolean isAlpha(String name) {
        return name.matches("[а-яА-Я]+") || name.matches("[a-zA-Z]+");
    }
}
