package projects.CalenderProject;

public class MyCalendar {

    int [] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String [] months = {" ", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public int day(int month, int day, int year){
        int y = year-(14-month)/12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12*((14-month)/12)-2;
        int d = (day + x + (31*m)/12%7);

        return d;
    }

    public boolean isLeapYear(int year){
        if (year%4 == 0 && year%100 != 0) return true;
        if (year%400 == 0) return true;

        return false;
    }

    public void viewCalender(String month, int year){
        if (isLeapYear(year)) days[2] = 29;
        int monthCount = 0;

        for (int i=1; i<months.length; i++){
            if (month.equals(months[i])){
                monthCount = i;
                break;
            }
        }

        int day = day(monthCount, 1, year);

        System.out.println(String.format((char)27 + "[33m%18s,%5d", months[monthCount], year));
        System.out.println();
        System.out.println(String.format((char)27 + "[34m%5s%5s%5s%5s%5s" + (char)27 + "[31m%5s%5s", "S", "M", "T", "W", "T", "F", "S"));

        for (int i=0; i<day%7; i++){
           System.out.print(String.format("%5s", " "));
        }
        for (int i=1; i<=days[monthCount]; i++){

            if ((i+day)%7 == 6 || (i+day)%7 == 0){
                System.out.print(String.format((char)27 + "[31m%5d", i));
            }
            else System.out.print(String.format((char)27 + "[34m%5d", i));

            if (((i+day)%7 == 0) || (i==days[monthCount]))
                System.out.println();
        }

    }
}
