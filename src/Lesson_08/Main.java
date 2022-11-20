package Lesson_08;

import Lesson_08.Interfaces.Player;
import Lesson_08.Models.CroupierBJ;
import Lesson_08.Models.GameBJImpl;
import Lesson_08.Models.PlayerImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.Создать класс игра
        //2. Создаем игороков
        //3.создать диллера
        //4.Добавить игроков и крупье в игру
        //5.Добавить колоду карт
        //6.Добавим карты в колоду
        //7.Раздать каждому игроку по две карты на старте
        //8.Раздавать каждому игроку по одной карте пока это требуется
        //9.определить победителя
        Scanner in = new Scanner(System.in);
        GameBJImpl gameBJ= new GameBJImpl();


        PlayerImpl player1= new PlayerImpl();
        PlayerImpl player2= new PlayerImpl();
        System.out.println("Имя первого игрока");
        player1.setPlayerName(in.nextLine());
        System.out.println("Имя второго игрока");
        player2.setPlayerName(in.nextLine());
        CroupierBJ croupier=new CroupierBJ();
        croupier.setPlayerName("Крупье");
        gameBJ.addPlayerInGame(player1);
        gameBJ.addPlayerInGame(player2);
        gameBJ.addPlayerInGame(croupier);

        gameBJ.giveTwoCardOnHand();
        gameBJ.giveOneCardIfNeedToPlayer();

        gameBJ.printWinner();

    }
}
