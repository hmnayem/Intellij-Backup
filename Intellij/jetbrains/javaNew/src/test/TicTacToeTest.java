package test;

import java.util.Scanner;

public class TicTacToeTest {

    private static final int X = 1;
    private static final int O = -1;
    private static int[][] board = new int[3][3];
    private static final int EMPTY = 0;
    private static int player;

    public static void main(String[] args){

        clear();
        gameBoard();

        Scanner scanner = new Scanner(System.in);
        int inp, count=0;
        boolean isdraw = true;

        while (count<9){
            System.out.println();
            if (player>0)
                System.out.print("Player 1's Turn : ");
            else System.out.println("Player 2's Turn : ");

            inp = scanner.nextInt();
            System.out.println();

            switch (inp){
                case 1:
                    board[0][0] = player;
                    count++;
                    break;
                case 2:
                    board[0][1] = player;
                    count++;
                    break;
                case 3:
                    board[0][2] = player;
                    count++;
                    break;
                case 4:
                    board[1][0] = player;
                    count++;
                    break;
                case 5:
                    board[1][1] = player;
                    count++;
                    break;
                case 6:
                    board[1][2] = player;
                    count++;
                    break;
                case 7:
                    board[2][0] = player;
                    count++;
                    break;
                case 8:
                    board[2][1] = player;
                    count++;
                    break;
                case 9:
                    board[2][2] = player;
                    count++;
                    break;
                default:
                    System.out.println("Invalid Entry");
            }

            gameBoard();

            if (isWin(player)){
                isdraw = false;
                System.out.println("Player " + (player>0?1:2) + " is win");
                break;
            }

            player = -player;

        }

        if (isdraw)
            System.out.println("TIE");



    }

    private static void clear(){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                board[i][j] = EMPTY;
            }
        }
        player = X;
    }

    private static void gameBoard(){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(String.format("%3s", board[i][j]==0?"": board[i][j]==1?" X ":" O "));

                if (j<2)
                    System.out.print("|");
            }
            System.out.println();
            if (i<2){
                for (int k=0; k<10; k++){
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    private static boolean isWin(int player){
        if (board[0][0]+board[0][1]+board[0][2] == 3*player)
            return true;
        if (board[1][0]+board[1][1]+board[1][2] == 3*player)
            return true;
        if (board[2][0]+board[2][1]+board[2][2] == 3*player)
            return true;
        if (board[0][0]+board[1][0]+board[2][0] == 3*player)
            return true;
        if (board[1][0]+board[1][1]+board[1][2] == 3*player)
            return true;
        if (board[2][0]+board[2][1]+board[2][2] == 3*player)
            return true;
        if (board[0][0]+board[1][1]+board[2][2] == 3*player)
            return true;
        if (board[0][2]+board[1][1]+board[2][0] == 3*player)
            return true;

        return false;
    }


}
