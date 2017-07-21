package pkg1.lambdas;

import java.util.Arrays;
import java.util.List;

public class FirstLambdas {

    public static void main(String[] args){

        List<Integer> ls = Arrays.asList(3,5,2,8,1,6,7,9);

        for(int i = 0; i<ls.size(); i++)
            System.out.print(ls.get(i) + " ");
    }
}
