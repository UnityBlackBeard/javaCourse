package Lesson_08.Models;

import Lesson_08.Interfaces.GameBJ;
import Lesson_08.Interfaces.Player;

import java.sql.SQLOutput;

public class GameBJImpl implements GameBJ {


    PlayerImpl [] playersInGame= new PlayerImpl[3];
    DeckOfCardsImpl deckOfCards = new DeckOfCardsImpl();

    @Override
    public void addPlayerInGame(PlayerImpl player) {
        for (int i = 0; i <playersInGame.length ; i++) {
            if(playersInGame[i]==null){
                playersInGame[i]=player;
                break;

            }
        }
    }

    @Override
    public void giveTwoCardOnHand() {
        for (int i = 0; i <playersInGame.length ; i++) {
            if(playersInGame[i]!=null) {
            playersInGame[i].takeCard(deckOfCards.randomCards());
                playersInGame[i].takeCard(deckOfCards.randomCards());
            }
            }
    }

    @Override
    public void giveOneCardIfNeedToPlayer() {
        for (int i = 0; i <playersInGame.length ; i++) {
            if(playersInGame[i]!=null) {
while(playersInGame[i].needCard()){
    playersInGame[i].takeCard(deckOfCards.randomCards());
}
            }
            }
    }

    @Override
    public void printWinner() {
        for (PlayerImpl player:playersInGame) {
            if(player!=null){
                if(player.countValuesOfAllCardsOnHand()>21){
                    player.setInGame(false);
                }
            }
        }

       if(countPlayersInGame()==1){
      System.out.println("Победил игрок:");
      for(PlayerImpl player:playersInGame){
          if(player!=null && player.isInGame()){
              player.showCardsOnHand();
          }
      }
  }
//       int bestValue=0;
//        for (PlayerImpl player: playersInGame) {
//            if(player!=null && player.isInGame()){
//                if(bestValue<player.countValuesOfAllCardsOnHand()){
//                    bestValue=player.countValuesOfAllCardsOnHand();
//                }
//            }
//        }

        int bestValue=0;
        for (int i = 0; i <playersInGame.length ; i++) {
            if(playersInGame[i]!=null &&playersInGame[i].isInGame() ){
                if(bestValue<playersInGame[i].countValuesOfAllCardsOnHand()){
                    bestValue=playersInGame[i].countValuesOfAllCardsOnHand();
                    playersInGame[i].setWinner(true);
                    for (int j = 0; j <playersInGame.length ; j++) {
                        if(playersInGame[j]!=playersInGame[i]){
                            playersInGame[j].setWinner(false);
                        }
                    } {

                    }
                }
            }
        }

        for (PlayerImpl player: playersInGame) {
            if (player != null && player.isInGame()&&player.isWinner()) {
                System.out.println("Победил игрок : "+player.getPlayerName()+" ");
                player.showCardsOnHand();

            }
        }
    }




    public int countPlayersInGame(){
        int countPlayers=0;
        for (PlayerImpl player:playersInGame
        ) {
            if(player!=null && player.isInGame()){
                countPlayers++;
            }
        }
        return countPlayers;
    }
}
