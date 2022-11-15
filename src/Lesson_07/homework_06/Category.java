package Lesson_07.homework_06;

public class Category {

    private String categoryTitle;
    private Goods[] goods;


    public Category(String categoryTitle, Goods[] goods) {
        this.categoryTitle = categoryTitle;
        this.goods = goods;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public Goods[] getGoods() {
        return goods;
    }

    public void setGoods(Goods[] goods) {
        this.goods = goods;
    }
}
