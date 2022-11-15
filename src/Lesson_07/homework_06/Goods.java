package Lesson_07.homework_06;

public class Goods {

    private String title;
    private double price;
    private int rate;

    public Goods(String title, double price, int rate) {
        this.title = title;
        this.price = price;
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {

        this.rate = rate;
    }
}
