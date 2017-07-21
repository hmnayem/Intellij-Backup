package com.garjs;

import java.util.Calendar;

public class SimplePredefinedClass {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();

        if (calendar.get(Calendar.AM_PM) == Calendar.AM) {
            System.out.println("AM");
        }


    }
}