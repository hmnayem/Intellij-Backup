package com.guru;

import org.junit.Test;

import static org.junit.Assert.*;

public class DateHandlerClassTest {
    DateHandlerClass dt = new DateHandlerClass();

    @Test
    public void getMonth() throws Exception {
        assertEquals(3, dt.getMonth());
    }

    @Test
    public void getYear() throws Exception {

        assertEquals(2017, dt.getYear());
    }

    @Test
    public void getDayOfYear() throws Exception {

        System.out.println(dt.getDayOfYear());
    }

    @Test
    public void getWeekOfYear() throws Exception {

        System.out.println(dt.getWeekOfYear());
    }

    @Test
    public void getWeekOfMonth() throws Exception {
        System.out.println(dt.getWeekOfMonth());
    }

    @Test
    public void details() throws Exception {
        dt.details();
    }

    @Test
    public void testgetHourMethod24() {
        assertEquals(3, dt.getHour24());
    }

    @Test
    public void testgetHourMethod12() {
        assertEquals(3, dt.getHour12());
    }
    @Test
    public void testgetMinuteMethod() {
        assertEquals(1, dt.getMinute());
    }

    @Test
    public void testGetTimeString() {
        System.out.println(dt.getTimeAndDate());

    }

    @Test
    public void testGetDay() {
        System.out.println(dt.getDay());

    }


}