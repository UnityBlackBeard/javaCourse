package Lesson_07.homework_06;

public class User {

    private String login;
    private char[] pass;

    private Basket basket;

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public char[] getPass() {
        return pass;
    }

    public void setPass(char symbol) {
        for (int i = 0; i <pass.length ; i++) {
            pass[i]=symbol;
        }
    }
}
