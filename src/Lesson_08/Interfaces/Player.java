package Lesson_08.Interfaces;

public interface Player {

    void takeCard(Card card);
    int countValuesOfAllCardsOnHand();
    boolean needCard();
    void showCardsOnHand();

}
