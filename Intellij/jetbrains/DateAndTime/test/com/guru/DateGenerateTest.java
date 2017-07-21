package com.guru;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class DateGenerateTest {

    DateGenerate dg = new DateGenerate();

    @Test
    public void leapYearTestPositiveScenario() {

        assertTrue(dg.isLeapYear(2016));
    }

    @Test
    public void leapYearTestNegetiveScenario() {
        assertFalse(dg.isLeapYear(2017));

    }

    @Test
    public void testDisplayOfACalender() {
        dg.displayCalender(3, 2017);

    }


}
