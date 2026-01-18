package org.example.Tic_Tac_Toe;

public class FullRowWinningStrategy implements WinningStrategy{
    @Override
    public boolean isWinner(Board board, Player player) {
        // need to implement
        return isPlayerWon(player, board);
    }

    private boolean isPlayerWon(Player currPlayer, Board board){
        // is there a row win for currPlayer
        for(int i=0;i<board.getSize() ; i++){
            boolean isWin = true;
            for(int j=0;j< board.getSize();j++){
                if(board.getSymbol(i,j)!=currPlayer.getSymbol()){
                    isWin = false;
                    break;
                }
            }
            if(isWin) return  true;
        }

        // is there a column win for currPlayer

        for(int i=0;i<board.getSize() ; i++){
            boolean isWin = true;
            for(int j=0;j< board.getSize();j++){
                if(board.getSymbol(j,i)!=currPlayer.getSymbol()){
                    isWin = false;
                    break;
                }
            }
            if(isWin) return  true;
        }

        // is there a diagonal win

        int row = 0, col =0;
        boolean isWin = true;
        while(row< board.getSize() && col < board.getSize()){
            if(board.getSymbol(row,col)!=currPlayer.getSymbol()){
                isWin = false;
                break;
            }
            row++;
            col++;
        }
        if(isWin) return true;

        isWin = true;
        row = 0;
        col = board.getSize()-1;
        while(row< board.getSize() && col>=0){
            if(board.getSymbol(row,col)!=currPlayer.getSymbol()){
                isWin = false;
                break;
            }
            row++;
            col--;
        }
        if(isWin) return true;
        return false;


    }
}
