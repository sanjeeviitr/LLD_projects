package org.example.Tic_Tac_Toe;

public class GameState {

    private Board board;
    private WinningStrategy winningStrategy;

    public GameState(Board board , WinningStrategy strategy){
        this.board = board;
        this.winningStrategy = strategy;
    }

    public MoveType makeMove(Move move){
        if(move.getRow()< 0 || move.getRow() >= board.getSize() || move.getCol()< 0 || move.getCol() >= board.getSize() ){
            return MoveType.OUT_OF_INDEX;
        }
        if(board.getSymbol(move.getRow(), move.getCol())!=null){
            return MoveType.ALREADY_FILLED;
        }
        board.setBoard(move.getRow(), move.getCol(), move.getPlayer().getSymbol());
        return  MoveType.VALID;
    }


    public GameStatus gameOver(Player currPlayer){
        if(this.winningStrategy.isWinner(board, currPlayer)){
            return GameStatus.WINNER_DECLARED;
        }
        if(isGameDraw()){
            return GameStatus.DRAW;
        }
        return  GameStatus.IN_PROGRESS;
    }

    private boolean isGameDraw(){
        for(int i=0;i< board.getSize(); i++){
            for(int j=0;j< board.getSize(); j++){
                if(board.getSymbol(i, j)==null){
                    return false;
                }
            }
        }
        return  true;
    }
}
