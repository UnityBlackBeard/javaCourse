package Lesson_08.Models;

public class CroupierBJ extends PlayerImpl{



    @Override
    public boolean isCroupier() {
        return true;
    }
    @Override
    public boolean needCard() {
        return countValuesOfAllCardsOnHand() <= 17;
    }


}
