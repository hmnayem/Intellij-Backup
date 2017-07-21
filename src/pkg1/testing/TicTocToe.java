package pkg1.testing;


import java.util.Scanner;

public class TicTocToe {

    public static final int X = 1, O = -1;
    public static final int EMPTY = 0;
    private int board[][] = new int[3][3];
    private int player;
    private static Scanner sc;

    public TicTocToe(){
        clearBoard();
    }

    public static void main(String[] args) {

        TicTocToe game = new TicTocToe();


        System.out.println("Please inter the position value.");
        System.out.println("Example: for 1st Box you should have input (0 0)");
        System.out.println();
        System.out.println(game);
        System.out.println();

        int x, o, count = 1;
        sc = new Scanner(System.in);

        while(game.isBlank()!= 0){
            if(count % 2 == 0){
                System.out.println("2nd players turn");
            }
            else
                System.out.println("1st players turn");

            count++;


            x = sc.nextInt();
            o = sc.nextInt();

            game.putMark(x, o);
            System.out.println(game);
            System.out.println();

            if(game.isGetReach()== 1) break;

            System.out.println("Please inter the position value.");
            System.out.println();

        }


        int winningPlayer = game.winner();
        String[] outcome = {"Player 2 Wins", "Tie", "Player 1 Wins"};

        System.out.println(outcome[1 + winningPlayer]);


    }


    public void clearBoard(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                board[i][j] = EMPTY;
            }
        }

        player = X;
    }

    public void putMark(int i, int j) throws IllegalArgumentException {
        if(i<0 || i>2 || j<0 || j>2)
            throw new IllegalArgumentException("Invalid Board Position");

        if(board[i][j] != EMPTY)
            throw new IllegalArgumentException("Board Position Occupied");

        board[i][j] = player;
        player = -player;
    }

    public boolean isWin(int mark){
        return ((board[0][0] + board[0][1] + board[0][2] == mark * 3)
                || (board[1][0] + board[1][1] + board[1][2] == mark * 3)
                || (board[2][0] + board[2][1] + board[2][2] == mark * 3)
                || (board[0][0] + board[1][0] + board[2][0] == mark * 3)
                || (board[0][1] + board[1][1] + board[2][1] == mark * 3)
                || (board[0][2] + board[1][2] + board[2][2] == mark * 3)
                || (board[0][0] + board[1][1] + board[2][2] == mark * 3)
                || (board[2][0] + board[1][1] + board[0][2] == mark * 3));

    }

    public int winner(){
        if(isWin(X))
            return X;
        else if(isWin(O))
            return O;
        else
            return 0;
    }

    public int isBlank(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(board[i][j]== EMPTY)
                    return 1;
            }
        }
        return 0;
    }

    public int isGetReach(){
        if(winner() == X)
            return 1;
        else if(winner()== O)
            return 1;
        return 0;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                switch(board[i][j]){
                    case X:
                        sb.append("X");
                        break;
                    case O:
                        sb.append("O");
                        break;
                    case EMPTY:
                        sb.append(" ");
                        break;
                }

                if(j<2)
                    sb.append(" | ");
            }
            if(i<2)
                sb.append("\n--------\n");
        }

        return sb.toString();
    }

}
