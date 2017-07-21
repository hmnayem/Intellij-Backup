package shegufa;


import java.util.Scanner;

public class BirthdayGirl{

    public static void main(String[] args) throws InterruptedException {

        String[] birthdayWish = {"Many Many Happy Returns Of The Day", "Happy Birth Day Shegufa"};

        String[] poem1 = {"When it comes to you", "I am crazy", "When it’s about you", "I feel all giddy", "When you are concerned",
                "I feel it’s my responsibility", "When you are in the picture", "By default, it involves me", "Everything in your life",
                "I want to make happy", "That my life’s only aim", "Nothing else means more to me", "Happy Birthday"};

        String[] poem2 = {"It’s your birthday,", "but I’m the lucky man", "who got to be with you.", "It’s your birthday, and the older you get,",
                "the more wonderful you become.", "It’s your birthday,", "and I’m privileged to share the years with you.", "It’s your birthday, and each day",
                "I find the depth of my love for you growing.", "It’s your birthday, and I look forward with joy", "to each day we spend together.",
                "It’s your birthday, and I wonder how I got along", "for all the birthdays I didn’t know you.", "It’s your birthday, and it’s amazing",
                "how easy and enjoyable it is to be with you each day.", "It’s your birthday, and no matter", "what fate has in store for us,", "I know it will be a pleasure to spend life with you.",
                "It’s your birthday, but I got the gift--"};

        String[] poem3 = {"I wish your birthday, Sweetheart,", "Would happen every day,", "So I could celebrate you", "With a compliment bouquet.",
                "I’d say you’ve made me happy", "Just by being you;", "Your feminine charm delights me", "In everything you do.", "Your birthday is so special,",
                "I wish I had the chance", "Each day to show I love you,", "With tender, sweet romance.", "I guess I’ll just pretend", "Every day’s the day of your birth,",
                "Another opportunity", "To show you all you’re worth!"};

        String[] finalPoem1 = {"I can’t change the past", "Nor do I want to", "Every day is a new start", "When spent with you", "A beautiful journey",
                "A road with no end", "Is what life is, when", "Lived with a real friend", "Happy Birthday"};

        String[] finalPoem2 = {"I’ve spoken many lies", "I’ve broken many promises", "I’ve picked up many fights", "I’ve given you bad memories",
                "Yet, through this chaos", "By my side, you’ve stood strong", "Backing me all the time", "Even when you know I was wrong", "What did I do to deserve",
                "Such a loyal friend, I have no clue", "But one thing’s for sure, my life", "Is nothing without you", "Happy Birthday"};

        String[] finalWords = {"Thank you very much,", "To being my best friend.", "Please! Give me a chance,", "To make you smiling"};

        String[] resturants = {"RMC", "KFC", "OLD TOWN", "HOT HUT", "STAR KABAB", "BASHUNDHARA CITY"};

        String[] giftList = {"Chocolate", "Book", "Show Piece", "Head Phone", "Gift Box", "Make up Box", "Ear Rings", "Rings", "Bracelet", "Necklace",
                "Cosmetics", "Birthday Card", "Diary"};

        String[] welcomeText = {"     Today is 25th January      ", "     It is an important day     ", "  A brave girl was born Today   ",
                "   I Wanna Thanks My Fortune    ", "     For Make Me Her Besti      ", "       Please Keep Silent       ",
                                "          And Say Her           ", "        Happy Birth Day         "};


        Scanner sc = new Scanner(System.in);
        int gift;

        System.out.print("\033[\033[2J");
        System.out.println((char)27 + "[31m\n\n\n\n\n\n\n\n\t\t\tPlease Wait.....");
        Thread.sleep(3000);
        for (int i=0; i<welcomeText.length; i++){
            animateText(welcomeText[i]);
        }
        wishing("HAPPY BIRTH DAY SHEGUFA");
        System.out.println("\n\n\n\n\n\n\n\n");
        pressAnyKey();



        System.out.print("\033[\033[2J");
        System.out.println((char)27 + "[31m\n\n\n\n\n\n\n\n\t\t\tPlease Wait.....");
        Thread.sleep(3000);

        System.out.print("\033[H\033[2J");
        System.out.println("\n\n\n\n");
        displayMessage(birthdayWish);
        pressAnyKey();


        System.out.print("\033[\033[2J");
        System.out.println((char)27 + "[31m\n\n\n\n\n\n\n\n\t\t\tPlease Wait.....");
        Thread.sleep(3000);

        System.out.print("\033[H\033[2J");
        System.out.println((char)27 + "[32mThere are available gift option. You have three chance to find out which was Nayem brought for you\n");
        displayeArrayElements(giftList);

        System.out.println((char)27 + "[34m\nYour First Chance");
        gift = sc.nextInt();
        System.out.println();
        System.out.print("\033[H\033[2J");
        System.out.println("\n\n\n\n");
        displayMessage(poem1);
        pressAnyKey();

        System.out.print("\033[H\033[2J");

        System.out.println((char)27 + "[32mThere are available gift option. You have three chance to find out which was Nayem brought for you\n");
        displayeArrayElements(giftList);

        if (gift == 2 || gift == 10 || gift == 11 || gift == 1)
            System.out.println((char)27 + "[32m\nYou have select a correct one.");
        else
            System.out.println((char)27 + "[32m\nSelect another one");


        System.out.println((char)27 + "[34mYour Second Chance");
        gift = sc.nextInt();
        System.out.println();
        System.out.print("\033[H\033[2J");
        System.out.println("\n\n");
        displayMessage(poem2);
        pressAnyKey();

        System.out.print("\033[H\033[2J");

        System.out.println((char)27 + "[32mThere are available gift option. You have three chance to find out which was Nayem brought for you\n");
        displayeArrayElements(giftList);

        if (gift == 2 || gift == 10 || gift == 11 || gift == 1)
            System.out.println((char)27 + "[32m\nYou have select a correct one.");
        else
            System.out.println((char)27 + "[32m\nSelect another one");


        System.out.println((char)27 + "[34mYour Third Chance");
        gift = sc.nextInt();
        System.out.println();
        System.out.print("\033[H\033[2J");
        System.out.println("\n\n\n");
        displayMessage(poem3);
        System.out.println();
        if (gift == 2 || gift == 10 || gift == 11 || gift == 1)
            System.out.println((char)27 + "[32mYou have select a correct one.");
        else
            System.out.println((char)27 + "[32mSelect another one");

        pressAnyKey();


        System.out.print("\033[\033[2J");
        System.out.println((char)27 + "[31m\n\n\n\n\n\n\n\n\t\t\tPlease Wait.....");
        Thread.sleep(3000);

        System.out.print("\033[H\033[2J");
        System.out.println("\n\n\n\n\n");
        System.out.println((char)27 + "[32mSystem will pick one of the following restaurant by a lottery\n");
        displayeArrayElements(resturants);
        System.out.println();
        pressAnyKey();
        System.out.print("\033[H\033[2J");
        System.out.println("\n\n\n\n\n\n\n");
        System.out.println((char)27 + "[32mWe will celebrate your birthday in ... " + findResturant(resturants));
        System.out.println("\n\n");
        pressAnyKey();


        System.out.print("\033[\033[2J");
        System.out.println((char)27 + "[31m\n\n\n\n\n\n\n\n\t\t\tPlease Wait.....");
        Thread.sleep(3000);

        System.out.println();
        System.out.print("\033[H\033[2J");
        System.out.println("\n\n\n\n");
        displayMessage(finalPoem1);
        System.out.println();
        pressAnyKey();


        System.out.print("\033[\033[2J");
        System.out.println((char)27 + "[31m\n\n\n\n\n\n\n\n\t\t\tPlease Wait.....");
        Thread.sleep(3000);

        System.out.println();
        System.out.print("\033[H\033[2J");
        System.out.println("\n\n\n\n");
        displayMessage(finalPoem2);
        System.out.println();
        pressAnyKey();



        System.out.print("\033[\033[2J");
        System.out.println((char)27 + "[31m\n\n\n\n\n\n\n\n\t\t\tPlease Wait.....");
        Thread.sleep(3000);

        System.out.print("\033[H\033[2J");
        System.out.println("\n\n\n\n");
        displayMessage(finalWords);
        pressAnyKey();
        System.out.print("\033[H\033[2J");
        cake();
        System.out.println();
        pressAnyKey();




    }


    private static void displayMessage(String[] msg) throws InterruptedException {

        for (int i=0; i<msg.length; i++){
            if ((i+1)%2 == 0)
                System.out.print((char)27 + "[34m\t\t\t");
            else
                System.out.print((char)27 + "[32m\t\t");

            for (int j=0; j<msg[i].length(); j++){
                System.out.print(msg[i].charAt(j) + "");
                Thread.sleep(300);
            }
            System.out.println();
        }
    }

    private static void displayMenu(){
        System.out.println();
        System.out.print("\033[H\033[2J");
        System.out.print("\t\t");
        for (int i=1; i<40; i++)
            System.out.print((char)27 + "[33m*");

        System.out.println();
        System.out.println((char)27 + "[33m\t\t*\t1.\t" + (char)27 + "[34mSay Happy Birthday");
        System.out.println((char)27 + "[33m\t\t*\t2.\t" + (char)27 + "[34mGrub Your Gift");
        System.out.println((char)27 + "[33m\t\t*\t3.\t" + (char)27 + "[34mTreat Place");
        System.out.println((char)27 + "[33m\t\t*\t4.\t" + (char)27 + "[34mFor YOU 1");
        System.out.println((char)27 + "[33m\t\t*\t5.\t" + (char)27 + "[34mFor You 2");
        System.out.println((char)27 + "[33m\t\t*\t6.\t" + (char)27 + "[34mExit");

        System.out.print("\t\t");
        for (int i=1; i<25; i++)
            System.out.print((char)27 + "[33m*");

        System.out.println("\n");
        System.out.print((char)27 + "[33m\t\t*\tSelect a Option : ");
    }

    private static void pressAnyKey(){
        System.out.println((char)27 + "[31m\nPress any Key to continue...");

        try {
            System.in.read();
        }catch (Exception ignored){

        }
    }

    private static String findResturant(String[] str){

        int len = str.length;
        int choice=0;

        for (int i=0; i<4; i++){
            choice = (int)(Math.random()*len);
        }

        return str[choice];
    }

    private static void displayeArrayElements(String[] str){
        for (int i=0; i<str.length; i++){
            System.out.print((char)27 + "[34m\t" + str[i] + (char)27 + "[31m (" + (i+1) + ")");
        }
        System.out.println();
    }

    private static void animateText(String text) throws InterruptedException {
        for (int i=text.length()-1; i>=0; i--){
            System.out.print("\033[H\033[2J");
            System.out.print("\n\n\n\n\n\n\n\n\t\t\t| ");

            for (int j=i; j<text.length(); j++){
                System.out.print((char)27 + "[34m" + text.charAt(j));
            }

            for (int j=1; j<i+1; j++){
                System.out.print(" ");
            }
            System.out.print(" | ");
            Thread.sleep(500);
        }

        Thread.sleep(1000);

        for (int i=0; i<text.length(); i++){
            System.out.print("\033[H\033[2J");
            System.out.print("\n\n\n\n\n\n\n\n\t\t\t| ");

            for (int j=i; j<text.length(); j++){
                System.out.print((char)27 + "[33m" + text.charAt(j));
            }

            for (int j=1; j<i+1; j++){
                System.out.print(" ");
            }
            System.out.print(" | ");
            Thread.sleep(500);
        }
    }

    private static void wishing(String text) throws InterruptedException {
        int count = 0;
        do {
            System.out.print("\033[H\033[2J");
            System.out.print("\n\n\n\n\n\n\n\n\t\t\t   " + (char)27 + "[31m" + text);
            Thread.sleep(350);
            System.out.print("\033[H\033[2J");
            System.out.print("");
            Thread.sleep(350);
            System.out.print("\033[H\033[2J");
            System.out.print("\n\n\n\n\n\n\n\n\t\t\t   " + (char)27 + "[32m" + text);
            Thread.sleep(350);
            System.out.print("\033[H\033[2J");
            System.out.print("");
            Thread.sleep(350);
            System.out.print("\033[H\033[2J");
            System.out.print("\n\n\n\n\n\n\n\n\t\t\t   " + (char)27 + "[33m" + text);
            Thread.sleep(350);
            System.out.print("\033[H\033[2J");
            System.out.print("");
            Thread.sleep(350);
            System.out.print("\033[H\033[2J");
            System.out.print("\n\n\n\n\n\n\n\n\t\t\t   " + (char)27 + "[34m" + text);
            Thread.sleep(350);
            System.out.print("\033[H\033[2J");
            System.out.print("");
            Thread.sleep(500);
            count++;

        }while (count != 10);
    }

    private static void cake()
    {
        System.out.print((char)27 + "[33m");
        System.out.println(String.format("%37s", "/^\\"));
        System.out.println(String.format("%27s%11s%5s", "/", "(/^\\)", "/"));
        System.out.println(String.format("%22s%6s%9s%7s%8s", "\\", "( \\", "\\ /", "( \\", "/^\\"));
        System.out.println(String.format("%23s%6s%8s%8s%8s", "/ )", "\\ |", "_|_", "\\ |", "|/^\\|"));
        System.out.println(String.format("%22s%7s%8s%8s%7s", "| /", "_|_", "| |", "_|_", "\\ /"));
        System.out.println(String.format("%22s%7s%8s%8s%7s", "_|_", "| |", "| |", "| |", "_|_"));

        System.out.println(String.format("%22s%7s%8s%8s%7s", "| |", "| |", "| |", "| |", "| |"));
        System.out.println(String.format("%22s%7s%5s%7s", "| |", "| |", ".....| |.....| |", "| |"));
        System.out.println(String.format("%22s%7s%5s%7s", "| |", "....| |", ".....| |.....| |", "....| |"));
        System.out.println(String.format("%22s%7s%8s%8s%7s%5s", ".| |", "| |", "| |", "| |", "| |", "....."));
        System.out.println(String.format("%22s%18s%12s%7s", ".  | |", "H A P P Y", "| |", "."));

        System.out.print((char)27 + "[32m");

        System.out.println(String.format("%22s%39s", ".       ", "."));
        System.out.println(String.format("%22s%24s%15s", "|.      ", "B I R T H D A Y", ".|"));
        System.out.println(String.format("%24s%37s", "| ........", "........ |"));
        System.out.println(String.format("%16s%16s%21s%8s", "|@", "..........", ".........", "@|"));
        System.out.println(String.format("%18s%26s%17s", "|@@@", "S H E G U F A", "@@@|"));
        System.out.println(String.format("%18s%10s%25s%8s", "|@@ ", "@@@@@@@", "@@@@@@@", "@@|"));
        System.out.println(String.format("%20s%23s%17s", ". @@@", "@@@@@@@@@@@@", "@@@ ."));
        System.out.println(String.format("%18s%10s%12s%13s%6s", ".@", "@@@", "@@@@@", "@@@", "@."));
        System.out.println(String.format("%21s%33s", "@@@", "..................................@@@"));


        System.out.println();
        System.out.println();
    }
}
