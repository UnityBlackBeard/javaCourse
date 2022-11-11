package Lesson_05;

public class Contact {
    //поля
    private String name;
    private String phoneNumber;
    private String email;

    //2. конструктор
    public Contact(String name, String phoneNumber, String email){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;

    }

    public Contact() {
    }

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //3. методы установки значений
    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
