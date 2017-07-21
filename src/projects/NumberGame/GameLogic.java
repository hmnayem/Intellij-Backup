package projects.NumberGame;

public class GameLogic {

    private String [][] questions = new String[5][10];
    private int [] levels = {0, 10, 25, 50, 70, 100};

    public GameLogic(){

        for (int i=0; i<5; i++){

            fillLevel(i);
        }
    }

    private String generateQuestion(char sign, int start, int range){

        String question;

        int number1 = (int)(Math.random()*range) + start;
        int number2 = (int)(Math.random()*range) + start;

        question = "" + number1 + " " + sign + " " + number2 + " = ?" ;

        return question;
    }

    private void fillLevel(int level){

        char [] signs = {'+', '-', '*', '/', '%'};

        for (int i=0; i<10; i++){
            int rand = (int)(Math.random()*5);
            questions[level][i] = generateQuestion(signs[rand], levels[level], levels[level+1]);
        }
    }

    private int generateAnswer(String question){
        int ans = 0;

        String [] values = question.split(" ");

        switch (values[1]){
            case "+":
                ans = Integer.parseInt(values[0]) + Integer.parseInt(values[2]);
                break;
            case "-":
                ans = Integer.parseInt(values[0]) - Integer.parseInt(values[2]);
                break;
            case "*":
                ans = Integer.parseInt(values[0]) * Integer.parseInt(values[2]);
                break;
            case "/":
                ans = Integer.parseInt(values[0]) / Integer.parseInt(values[2]);
                break;
            case "%":
                ans = Integer.parseInt(values[0]) % Integer.parseInt(values[2]);
                break;
        }

        return ans;
    }

    public String getQuestion(int level, int number){

        return questions[level][number];
    }

    public int getResult(String question){

        return generateAnswer(question);
    }
}
