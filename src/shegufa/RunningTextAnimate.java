package shegufa;


public class RunningTextAnimate {

    public static void main(String... args) throws InterruptedException{

        String name  = "** Programmers Are GOD ** ";
        int condition = 1;

        do {
            if (condition == 2){

                for (int i=name.length()-1; i>=0; i--){
                    System.out.print("\033[H\033[2J");
                    System.out.print("\t\t| ");
                    for (int j=i; j<name.length(); j++){
                        System.out.print(name.charAt(j));
                    }
                    for(int k=1; k<i+1; k++){
                        System.out.print(" ");
                    }
                    System.out.print("|   ");
                    Thread.sleep(500);
                }

                condition = 1;
            }

            else{
                for (int i=0; i<name.length(); i++){
                    System.out.print("\033[H\033[2J");
                    System.out.print("\t\t| ");
                    for (int j=i; j<name.length(); j++){
                        System.out.print(name.charAt(j));
                    }

                    for(int k=1; k<i+1; k++){
                        System.out.print(" ");
                    }
                    System.out.print("|   ");
                    Thread.sleep(500);

                }

                condition = 2;
            }
        }while (true);

    }
}
