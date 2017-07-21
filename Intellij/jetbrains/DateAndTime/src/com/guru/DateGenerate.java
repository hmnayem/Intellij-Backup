package com.guru;

public class DateGenerate {

    private int [] totalDaysOfAMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String [] months = {" ", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


    private int dayCode(int day, int month, int year) {

        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = day + x + (31 * m) / 12 % 7;

        return d;
    }

    public boolean isLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }

        if (year % 400 == 0) {
            return true;
        }

        return false;
    }

    public void displayCalender(int month, int year) {

        if (isLeapYear(year)) {
            totalDaysOfAMonth[2] = 29;
        }


        int dayCode = dayCode(1, month, year);

        System.out.println(String.format("%10s%-10s%-6d", " ", months[month], year));

        for (int i = 1; i < 36; i++) {
            System.out.print("-");
        }

        System.out.println();

        System.out.println(String.format("%5s%5s%5s%5s%5s%5s%5s", "  S  ", "  M  ", "  T  ", "  W  ", "  T  ", "  F  ", "  S  "));

        for (int i = 1; i < 36; i++) {
            System.out.print("-");
        }

        System.out.println();

        for (int i=0; i<dayCode%7; i++) {
            System.out.print(String.format("%5s", " "));
        }

        for (int i=1; i <= totalDaysOfAMonth[month]; i++) {
            System.out.print(String.format("%3d%2s", i, " "));

            if ((i + dayCode) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();

        for (int i = 1; i < 36; i++) {
            System.out.print("-");
        }

        System.out.println();

    }

}
