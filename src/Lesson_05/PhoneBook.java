package Lesson_05;

public class PhoneBook {
//1. поля
    public Contact[] contacts=new Contact[10];



    //2. конструкторы


    //3. методы
public void addContact(Contact contact){
    for (int i = 0; i <contacts.length ; i++) {

        if(contacts[i]==null) {
            contacts[i] = contact;
            break;
        }
    }
}

    public Contact[] getContacts() {
        return contacts;
    }
}
