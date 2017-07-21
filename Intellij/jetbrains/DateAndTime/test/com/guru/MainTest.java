package com.guru;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    Main mn = new Main();

    @Test
    public void perform1() throws Exception {

        mn.perform1("cal");

    }

    @Test
    public void perform2() throws Exception {

        mn.perform2("time24");

    }

}