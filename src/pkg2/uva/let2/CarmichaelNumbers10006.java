package pkg2.uva.let2;

public class CarmichaelNumbers10006 {

    public static void main(String[] args){

        System.out.println(isCarmichael(17));

    }

    private static boolean isPrime(int n){
        if(n>2 && n%2==0)
            return false;

        int top = (int)Math.sqrt(n) + 1;

        for (int i=3; i<top; i+=2){
            if (n%i == 0)
                return false;
        }

        return true;
    }

    private static boolean isCarmichael(int n){

        boolean r = true;
        for (int i=1; i<=10; i++){
            int a = (int)(Math.random()*(n-2)) +2;

            int x = (int) Math.pow(a,n)%n;

            if(a != x){
                r = false;
                break;
            }
        }

        return r;
    }
}

//11530