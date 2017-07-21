package shegufa;

public class TestingAnimation {

    public static void main(String[] args){
        System.out.println(String.format("%50s", "/^\\"));
        System.out.println(String.format("%40s%11s%5s", "/", "(/^\\)", "/"));
        System.out.println(String.format("%35s%6s%9s%7s%8s", "\\", "( \\", "\\ /", "( \\", "/^\\"));
        System.out.println(String.format("%36s%6s%8s%8s%8s", "/ )", "\\ |", "_|_", "\\ |", "|/^\\|"));
        System.out.println(String.format("%35s%7s%8s%8s%7s", "| /", "_|_", "| |", "_|_", "\\ /"));
        System.out.println(String.format("%35s%7s%8s%8s%7s", "_|_", "| |", "| |", "| |", "_|_"));

        System.out.println(String.format("%35s%7s%8s%8s%7s", "| |", "| |", "| |", "| |", "| |"));
        System.out.println(String.format("%35s%7s%5s%7s", "| |", "| |", ".....| |.....| |", "| |"));
        System.out.println(String.format("%35s%7s%5s%7s", "| |", "....| |", ".....| |.....| |", "....| |"));
        System.out.println(String.format("%35s%7s%8s%8s%7s%5s", ".| |", "| |", "| |", "| |", "| |", "....."));
        System.out.println(String.format("%35s%18s%12s%7s", ".  | |", "H A P P Y", "| |", "."));
        System.out.println(String.format("%35s%39s", ".       ", "."));
        System.out.println(String.format("%35s%24s%15s", "|.      ", "B I R T H D A Y", ".|"));
        System.out.println(String.format("%37s%37s", "| ........", "........ |"));
        System.out.println(String.format("%29s%16s%21s%8s", "|@", "..........", ".........", "@|"));
        System.out.println(String.format("%31s%26s%17s", "|@@@", "S H E G U F A", "@@@|"));
        System.out.println(String.format("%31s%10s%25s%8s", "|@@ ", "@@@@@@@", "@@@@@@@", "@@|"));
        System.out.println(String.format("%33s%23s%17s", ". @@@", "@@@@@@@@@@@@", "@@@ ."));
        System.out.println(String.format("%31s%10s%12s%13s%6s", ".@", "@@@", "@@@@@", "@@@", "@."));
        System.out.println(String.format("%33s%33s", "@@@", "...................................@@@"));


        System.out.println();
        System.out.println();

    }
}
