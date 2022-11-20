package Lesson_08.Models;

import Lesson_08.Interfaces.Card;
import Lesson_08.Interfaces.Player;

import java.util.Scanner;

public class PlayerImpl implements Player {


    Card [] cardsOnHand=new Card[100];
    boolean inGame=true;
   private boolean winner=false;
   private String playerName;

    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public boolean isWinner() {
        return winner;
    }

    @Override
    public boolean isCroupier() {
        return false;
    }

    @Override
    public void takeCard(Card card) {
        for (int i = 0; i <cardsOnHand.length; i++) {
            if(cardsOnHand[i]==null){
                cardsOnHand[i]=card;
                break;
            }
        }
    }

    @Override
    public int countValuesOfAllCardsOnHand() {
        int count=0;
        for (Card cards:cardsOnHand) {
            if (cards!=null) {
                count += cards.getValue();
            }
        }

        return count;
    }

    @Override
    public boolean needCard() {
        System.out.println("---------Ваши карты ---------------");
        showCardsOnHand();
        System.out.println("Еще?");
        Scanner in = new Scanner(System.in);
        String answer=in.next();
        if (answer.equals("Да")){
            return true;
        }

        return false;
    }

    @Override
    public void showCardsOnHand() {
       for( Card card :cardsOnHand){
           if(card!=null) {
               card.printCard();
           }
       }

    }

    public boolean isInGame() {
        return inGame;
    }

    public void setInGame(boolean inGame) {
        this.inGame = inGame;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
