package pkg1.set.hashset;


import java.util.HashSet;
import java.util.Set;

public class DemoHashSet1 {

    public static void main(String[] args){
        Set<String> nameSet = new HashSet<>();
        Set<String> nameSet2 = new HashSet<>();

        nameSet.add("HM Nayem");
        nameSet.add("Shegufa Taranjum");
        nameSet2.add("HM Nayem");
        nameSet2.add("Shegufa Taranjum");


        System.out.println(nameSet.size());

    }
}
