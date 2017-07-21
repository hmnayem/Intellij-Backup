package com.guru;

import java.util.Scanner;

public class Main {

    DateHandlerClass dateHandler;
    DateGenerate dateGenerate;

    int date, year;

    public Main() {

        dateGenerate = new DateGenerate();
        dateHandler = new DateHandlerClass();

        date = dateHandler.getMonth();
        year = dateHandler.getYear();
    }


    public static void main(String[] args) {

        Main mn = new Main();
        Scanner sc = new Scanner(System.in);

        String commands = "";

        do {
            System.out.print("\nCommands >> ");
            commands = sc.nextLine();
            System.out.println();

            if (commands.equals("exit")) {
                break;
            }

            boolean check = mn.perform1(commands);

            boolean check2 = mn.perform2(commands);

            if (!check && !check2) {
                System.out.println("Not A Valid Command");
            }

        }
        while (!commands.equals("exit"));

    }

    public boolean perform1(String command) {

        if (command.equals("cal")) {
            dateGenerate.displayCalender(date, year);
            System.out.println();
            dateHandler.details();

            return true;
        }

        if (command.equals("next")) {
            date = date + 1;

            if (date > 12) {
                date = 1;
                year++;
            }

            dateGenerate.displayCalender(date, year);

            return true;
        }

        if (command.equals("prev")) {

            date = date - 1;

            if (date < 1){
                date = 12;
                year--;
            }

            dateGenerate.displayCalender(date, year);

            return true;
        }

        if (command.equals("reset")) {
            dateHandler = new DateHandlerClass();
            date = dateHandler.getMonth();
            year = dateHandler.getYear();

            dateGenerate.displayCalender(date, year);
            System.out.println();
            dateHandler.details();

            return true;
        }

        String [] coms = command.split(" ");
        int dd, yy;

        if (coms.length == 2) {
            dd = Integer.parseInt(coms[0]);
            yy = Integer.parseInt(coms[1]);

            if (dd > 0 && dd < 13 && yy >= 1960 && yy < 2100){
                dateGenerate.displayCalender(dd, yy);
                return true;
            }
        }

        return false;

    }

    public boolean perform2(String command) {

        if (command.equals("hour")) {
            System.out.println("Hour : " + dateHandler.getHour12());
            return true;
        }

        if (command.equals("hour24")) {
            System.out.println("Hour : " + dateHandler.getHour24());
            return true;
        }

        if (command.equals("min")) {
            System.out.println("Minute : " + dateHandler.getMinute());
            return true;
        }

        if (command.equals("time")) {
            String ampm = dateHandler.getAMPM() == 1 ? "PM" : "AM";

            System.out.println("Time :: " + dateHandler.getHour12() + " : " + dateHandler.getMinute() + " : " + dateHandler.getSeconds() + " " + ampm);

            return true;
        }

        if (command.equals("time24")) {
            System.out.println("Time :: " + dateHandler.getHour24() + " : " + dateHandler.getMinute() + " : " + dateHandler.getSeconds());

            return true;
        }

        if (command.equals("timedate")) {
            System.out.println("Time And Date : " + dateHandler.getTimeAndDate());
            return true;
        }

        if (command.equals("day")) {
            System.out.println("Day No : " + dateHandler.getDay());
            return true;
        }

        if (command.equals("month")) {
            System.out.println("Day of Weeks : " + dateGenerate.months[dateHandler.getMonth()]);
            return true;
        }

        if (command.equals("year")) {
            System.out.println("Year : " + dateHandler.getYear());
            return true;
        }

        if (command.equals("yearday")) {
            System.out.println("Day Of Year : " + dateHandler.getDayOfYear());
            return true;
        }

        if (command.equals("weekofyear")) {
            System.out.println("Week Of Year : " + dateHandler.getWeekOfYear());
            return true;
        }

        if (command.equals("weekofmonth")) {
            System.out.println("Week Of Month : " + dateHandler.getWeekOfMonth());
            return true;
        }

        if (command.equals("weekday")) {
            int day = dateHandler.getWeekDay();

            String dayS = "";

            switch (day) {
                case 1:
                    dayS = "Sunday";
                    break;

                case 2:
                    dayS = "Monday";
                    break;
               case 3:
                        dayS = "Tuesday";
                        break;
               case 4:
                        dayS = "Wednesday";
                        break;
               case 5:
                        dayS = "Thursday";
                        break;
               case 6:
                        dayS = "Friday";
                        break;
               case 7:
                        dayS = "Saturday";
                        break;

            }

            System.out.println("Week Day : " + day + " ( " + dayS + " )");
            return true;
        }

        return false;
    }


}



























