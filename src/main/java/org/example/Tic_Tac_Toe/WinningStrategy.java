package org.example.Tic_Tac_Toe;

public interface WinningStrategy {

    boolean isWinner(Board board, Player player);
}
