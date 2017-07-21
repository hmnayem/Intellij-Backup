package Contest.longcontest;

import java.util.Arrays;

public class NewYearOld {

    public static void main(String[] args){
        String year = "20166766";
        StringBuffer sb = new StringBuffer();
        int uglyNumber = 0;
        boolean isNice = false;
        int j=0;
        while (j<year.length()){
            if (year.charAt(j) == '2'){
                sb.append('2');
                j++;
                break;
            }

            j++;

        }

        while (j<year.length()){
            if (year.charAt(j) == '0'){
                sb.append('0');
                j++;
                break;
            }
            j++;
        }

        while (j<year.length()){
            if (year.charAt(j) == '1'){
                sb.append('1');
                j++;
                break;
            }
            j++;
        }

        while (j<year.length()){
            if (year.charAt(j) == '7'){
                sb.append('7');
                j++;
                break;
            }
            j++;
        }

        String str = sb.toString();

        if (str.equals("2017")){
            uglyNumber = year.length()-4;
        }else uglyNumber = -1;

        System.out.println(uglyNumber);
    }
}

