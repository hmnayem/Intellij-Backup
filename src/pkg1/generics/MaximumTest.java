package pkg1.generics;

public class MaximumTest {

   public static <T extends Comparable<T>>T max(T x, T y, T z){
       T max = x;

       if(y.compareTo(max) > 0)
           max = y;

       if(z.compareTo(max) > 0)
           max = z;

       return max;

   }

    public static void main(String[] args){

        System.out.println(max(3,4,5));
        System.out.println(max(8.8, 6.6, 7.7));
        System.out.println(max("Koli", "Nowrin", "Shegufa"));
    }
}
