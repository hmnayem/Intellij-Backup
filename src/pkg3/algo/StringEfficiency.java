package pkg3.algo;

public class StringEfficiency {

    public static void main(String[] args){

        /*
        long start = System.currentTimeMillis();
        System.out.println(repeat1('*', 400000));
        long end = System.currentTimeMillis();

        System.out.println("Total Ellapsed Time is : " + (end - start));

        System.out.println();

        */

        long start2 = System.currentTimeMillis();
        System.out.println(repeat2('*', 30000000));
        long end2 = System.currentTimeMillis();

        System.out.println("Total Ellapsed Time is : " + (end2 - start2));

    }

    public static String repeat1(char c, int size){

        String ans = "";

        for(int i=0; i<size; i++){
            ans += c;
        }

        return ans;
    }

    public static String repeat2(char c, long size){
        StringBuilder sb = new StringBuilder();

        for(long i=0; i<size; i++){
            sb.append(c);
        }

        return sb.toString();
    }
}
