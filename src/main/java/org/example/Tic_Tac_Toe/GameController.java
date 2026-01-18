package org.example.Tic_Tac_Toe;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class GameController {
    private Board board;
    private Player currPlayer;
    private GameState gameState;
    private Queue<Player> queue = new LinkedList<>();;
    private Move move;

    public GameController(Board board, List<Player> players, WinningStrategy strategy){
        this.board = board;
        this.gameState = new GameState(board, strategy);
        for(Player player : players){
            queue.add(player);
        }
    }

    public void startGame(){
        Scanner sc = new Scanner(System.in);
        int row, col;
        MoveType isValidMove = MoveType.START;
        GameStatus status;
        this.currPlayer = queue.peek();
        do{
            if(isValidMove == MoveType.VALID){
                Player finished = queue.poll();
                queue.offer(finished);
                this.currPlayer = queue.peek();
            }
            System.out.println("Please make move ");
            row = sc.nextInt();
            col = sc.nextInt();
            this.move = new Move(row, col, currPlayer);
            isValidMove = gameState.makeMove(this.move);
            if(isValidMove == MoveType.OUT_OF_INDEX){
                System.out.println("This is not a valid move, Please retry!");
            }
            if(isValidMove == MoveType.ALREADY_FILLED){
                System.out.println("This is already filled place, Please retry!");
            }
            board.printBoard();
            status = gameState.gameOver(currPlayer);
            if(status == GameStatus.WINNER_DECLARED){
                System.out.println("Player " + currPlayer.getName() + " is Won");
            }
            if(status == GameStatus.DRAW){
                System.out.println("Game is draw");
            }
        }while(status == GameStatus.IN_PROGRESS);
        sc.close();
    }




}
