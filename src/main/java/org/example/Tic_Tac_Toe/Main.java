package org.example.Tic_Tac_Toe;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Board board = new Board(3);
        Player p1 = new Player("Rahul" , Symbol.X);
        Player p2 = new Player("Shyam", Symbol.O);
        List<Player> players = new ArrayList<>();
        players.add(p1);
        players.add(p2);
        GameController controller = new GameController(board,players, new FullRowWinningStrategy());
        controller.startGame();

    }
}
