package org.example.Tic_Tac_Toe;

public class Move {

    private int row;
    private int col;
    private Player player;

    public Move(int row, int col, Player player) {
        this.row = row;
        this.player = player;
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public Player getPlayer() {
        return player;
    }

    public int getRow() {
        return row;
    }
}
