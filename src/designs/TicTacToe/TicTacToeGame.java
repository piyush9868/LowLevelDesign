package designs.TicTacToe;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class TicTacToeGame {

    Board board;
    Queue<Player> playerQueue;

    public TicTacToeGame() {
        initializeGame();
    }

    void initializeGame(){

        //initialize a board of size3 and two players are playing for now
        PlayingPiece[][] grid = new PlayingPiece[3][3];
        int size = 3;
        board = new Board(size, grid);

        Player p1 = new Player("Player 1", new PlayingPiece(PieceType.X));
        Player p2 = new Player("Player 2", new PlayingPiece(PieceType.O));

        playerQueue = new ArrayDeque<>();
        playerQueue.offer(p1);
        playerQueue.offer(p2);
    }

    public void startGame(){

        boolean started = true;
        System.out.println("---- Welcome to tic tac toe ----");

        while(started){

            if(board.isFull()){
                started = false;
                continue;
            }

            board.printGrid();
            Player currPlayer = playerQueue.peek();
            System.out.printf("Chance of %s -----\n", currPlayer.name);
            System.out.println("Please enter your coordinates separated by commas: ");

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] coordinates = input.split(",");

            //error message for input
            if(coordinates[0].length() > 1 ||
                    coordinates[1].length() > 1 ||
                    !Character.isDigit(coordinates[0].charAt(0)) ||
                    !Character.isDigit(coordinates[0].charAt(0))){
                System.out.println("Invalid Input!!!!");
                continue;
            }

            int x = Integer.parseInt(coordinates[0]);
            int y = Integer.parseInt(coordinates[1]);

            //place the piece
            boolean wasSuccessFull = board.addPiece(x, y, currPlayer);
            if(!wasSuccessFull){
                System.out.println("Can't place a piece here. Please try again!!");
                continue;
            }
            if(board.didPlayerWin(x, y, currPlayer)){
                System.out.printf("Congrats!! %s won!!!!\n" , currPlayer.name);
                started = false;
                continue;
            }
            playerQueue.poll();
            playerQueue.offer(currPlayer);

        }
        System.out.println("Tie!!!");
    }
}
