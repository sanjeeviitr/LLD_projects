package org.example.Tic_Tac_Toe;

public class Board {

    private int size;
    private Symbol[][] board;

    public Board(int size){
        this.size = size;
        this.board = new Symbol[size][size];

//        for(int i=0;i<size;i++) {
//            for (int j = 0; j < size; j++) {
//                board[i][j] = '-';
//            }
//        }
    }

    public void printBoard(){
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public int getSize(){
        return size;
    }

    public Symbol getSymbol(int row, int col){
        return board[row][col];
    }

    public  void setBoard(int row, int col, Symbol symbol){
        board[row][col] = symbol;
    }
}
