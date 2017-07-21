package com.guru;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateHandlerClass {

    Calendar calendar;
    Date date;

    public DateHandlerClass() {

        date = new Date();
        calendar = GregorianCalendar.getInstance();

        calendar.setTime(date);
    }

    public int getHour24() {

        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public int getHour12() {
        return calendar.get(Calendar.HOUR);
    }

    public int getMinute() {
        return calendar.get(Calendar.MINUTE);
    }

    public int getSeconds() {
        return calendar.get(Calendar.SECOND);
    }

    public int getAMPM() {
        return calendar.get(Calendar.AM_PM);
    }

    public String getTimeAndDate() {
        return calendar.getTime().toString();
    }

    public int getDay() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public int getWeekDay() {
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public int getMonth() {
        return calendar.get(Calendar.MONTH) + 1;
    }

    public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    public int getDayOfYear() {
        return calendar.get(Calendar.DAY_OF_YEAR);
    }

    public int getWeekOfYear() {
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    public int getWeekOfMonth() {
        return calendar.get(Calendar.WEEK_OF_MONTH);
    }

    public void details() {
        System.out.println(getTimeAndDate());
        System.out.println("Day Of The Year : " + getDayOfYear());
        System.out.println("Week Of The Year : " + getWeekOfYear());
    }


}
