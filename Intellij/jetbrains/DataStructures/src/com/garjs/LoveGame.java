package com.garjs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoveGame {

    public static void main(String[] args) {

        String name1 = "anonna";
        String name2 = "rahman";

        System.out.println(logic(name1, name2));

    }

    private static String logic(String name1, String name2) {
        char [] chars1 = name1.toCharArray();
        char [] chars2 = name2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        name1 = new String(chars1);
        name2 = new String(chars2);

        int lcs = lcs(name1, name2);

        int total = (name1.length() + name2.length()) - (lcs * 2);

        List<String> flames = new ArrayList<>();
        flames.add("F");
        flames.add("L");
        flames.add("A");
        flames.add("M");
        flames.add("E");
        flames.add("S");

        System.out.println("Flames Size is : " + flames.size());

        while (flames.size() != 1) {
            if (total > flames.size()) {
                int index = total - flames.size() - 1;

                while (index > flames.size()) {
                    index = index - flames.size();
                }
                flames.remove(index);

            } else {
                System.out.println("Total Value is : " + (total - 1));
                flames.remove(total - 1);
            }
        }

        return flamesText(flames.get(0));

    }

    private static String flamesText(String str) {

        switch (str) {
            case "F":
                return "Friends";

            case "L":
                return "Loves";

            case "A":
                return "Attraction";

            case "M":
                return "Marriage";

            case "E":
                return "Enemy";

            case "S":
                return "Smile";
        }

        return null;
    }

    private static int lcs(String name1, String name2) {

        int[][] arr = new int[name1.length() + 1][name2.length() + 1];

        for (int i=0; i<=name1.length(); i++) {
            for (int j=0; j<=name2.length(); j++) {
                if (i == 0 || j == 0) {
                    arr[i][j] = 0;
                } else if (name1.charAt(i - 1) == name2.charAt(j - 1)) {
                    arr[i][j] = arr[i - 1][j - 1] + 1;
                } else {
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
                }
            }
        }

        return arr[name1.length()][name2.length()];

    }
}
