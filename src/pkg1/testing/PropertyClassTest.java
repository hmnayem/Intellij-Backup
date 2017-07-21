package pkg1.testing;

import java.util.Properties;
import java.util.Set;

public class PropertyClassTest {

    public static void main(String[] args){

        Properties pros = System.getProperties();
        Set<Object> keySet = pros.keySet();

        for (Object obj : keySet){
            String key = (String) obj;

            System.out.println("{ " + obj + " = " + pros.getProperty(key) + " }");
        }
    }
}
