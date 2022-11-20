package Lesson_08.Interfaces;

import Lesson_08.Models.PlayerImpl;

public interface GameBJ {
    void addPlayerInGame(PlayerImpl player);

    void giveTwoCardOnHand();
    void giveOneCardIfNeedToPlayer();
    void printWinner();

}
