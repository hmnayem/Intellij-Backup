package projects.NumberGame;

import java.io.IOException;
import java.util.Scanner;

public class Game {

    GameLogic gameLogic;
    Scanner sc;
    int score;

    private boolean[] levels = {true, false, false, false, false};

    public Game(){
        gameLogic = new GameLogic();
        sc = new Scanner(System.in);
        score = 0;
    }

    public static void main(String[] args){

        int input=0, submenu;
        boolean result;
        Game game = new Game();

        do {

            game.menu();
            input = game.sc.nextInt();

            switch (input){

                case 1:

                    do {
                        game.printLevel();
                        submenu = game.sc.nextInt();

                        switch (submenu){

                            case 1:
                                result = game.level(0);
                                if (result){
                                    game.levels[1] = true;
                                    System.out.println();
                                    System.out.println("Your Score is : " + game.getScore());
                                }
                                else {
                                    System.out.println("Game Over!!!");
                                    System.out.println("Your Score is : " + game.getScore());
                                }
                                game.pressMe();
                                break;

                            case 2:
                                if (game.levels[1]){
                                    result = game.level(1);

                                    if (result){
                                        game.levels[2] = true;
                                        System.out.println();
                                        System.out.println("Your Score is : " + game.getScore());
                                    }
                                    else {
                                        System.out.println("Game Over!!!");
                                        System.out.println("Your Score is : " + game.getScore());
                                    }
                                }
                                else {
                                    System.out.println("Please complete the previous level to unlock");
                                }
                                game.pressMe();
                                break;

                            case 3:
                                if (game.levels[2]){
                                    result = game.level(2);

                                    if (result){
                                        game.levels[3] = true;
                                        System.out.println();
                                        System.out.println("Your Score is : " + game.getScore());
                                    }
                                    else {
                                        System.out.println("Game Over!!!");
                                        System.out.println("Your Score is : " + game.getScore());
                                    }
                                }
                                else {
                                    System.out.println("Please complete the previous level to unlock");
                                }
                                game.pressMe();
                                break;

                            case 4:
                                if (game.levels[3]){
                                    result = game.level(3);

                                    if (result){
                                        game.levels[4] = true;
                                        System.out.println();
                                        System.out.println("Your Score is : " + game.getScore());
                                    }
                                    else {
                                        System.out.println("Game Over!!!");
                                        System.out.println("Your Score is : " + game.getScore());
                                    }
                                }
                                else {
                                    System.out.println("Please complete the previous level to unlock");
                                }
                                game.pressMe();
                                break;

                            case 5:
                                if (game.levels[4]){
                                    result = game.level(4);

                                    if (result){
                                        System.out.println();
                                        System.out.println("Your Score is : " + game.getScore());
                                    }
                                    else {
                                        System.out.println("Game Over!!!");
                                        System.out.println("Your Score is : " + game.getScore());
                                    }
                                }
                                else {
                                    System.out.println("Please complete the previous level to unlock");
                                }
                                game.pressMe();
                                break;

                            case 0:
                                game.pressMe();
                                break;
                            case 7:
                                System.out.println("Invalid Selection");


                        }
                    }while (submenu!=0);
                    break;

                case 4:
                    input = 0;
                    break;

                default:
                    System.out.println("Invalid Selection");
                    break;



            }

        }while (input != 0);


    }

    private void menu(){
        System.out.println("**************");
        System.out.println("1. New Game");
        System.out.println("2. Score");
        System.out.println("3. Help");
        System.out.println("4. Exit");

        System.out.println("**************");
        System.out.print("Enter your choice : ");

    }

    private void printLevel(){
        System.out.println("*************");
        System.out.println(String.format("%s%s", "Level 1", levels[0]?"":"(LOCKED)"));
        System.out.println(String.format("%s%s", "Level 2", levels[1]?"":"(LOCKED)"));
        System.out.println(String.format("%s%s", "Level 3", levels[2]?"":"(LOCKED)"));
        System.out.println(String.format("%s%s", "Level 4", levels[3]?"":"(LOCKED)"));
        System.out.println(String.format("%s%s", "Level 5", levels[4]?"":"(LOCKED)"));
        System.out.println("Back to Main Menu 0");
        System.out.println("*************");
        System.out.print("Enter your choice : ");
    }

    private boolean level(int level){

        int ans;
        boolean result = false;
        System.out.println("Your Question goes here. You have to answer all answer correctly...");

        System.out.println();

        for (int i=0; i<10; i++){
            System.out.println(gameLogic.getQuestion(level, i));
            ans = sc.nextInt();

            if (ans == gameLogic.getResult(gameLogic.getQuestion(level, i))){
                System.out.println("Correct Answer");
                result = true;
                score += (level+1)*5;
            }
            else {
                System.out.println("Wrong Answer");
                result = false;
                break;
            }
        }

        return result;
    }

    private int getScore(){
        return score;
    }

    private void pressMe(){
        System.out.println("Press Enter to continue...");

        try{
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
