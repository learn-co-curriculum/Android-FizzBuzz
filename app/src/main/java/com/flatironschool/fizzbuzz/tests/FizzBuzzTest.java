package com.flatironschool.fizzbuzz.tests;

import android.test.InstrumentationTestCase;

import com.flatironschool.fizzbuzz.FizzBuzz;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by altyus on 6/26/14.
 */
public class FizzBuzzTest extends InstrumentationTestCase {

    private FizzBuzz mFizzBuzz;

    @Override
    protected void setUp() throws Exception {
        mFizzBuzz = new FizzBuzz(1, 15);
    }

    public void testFizzBuzzInstantiation() throws Exception {
        assertNotNull(mFizzBuzz);
        assertEquals(mFizzBuzz.getClass(), FizzBuzz.class);
    }

    public void testSetStartNumber() throws Exception {
        mFizzBuzz.setStartNumber(20);
        assertEquals(mFizzBuzz.getStartNumber(), (Integer)(20));
    }
    public void testSetEndNumber() throws Exception {
        mFizzBuzz.setEndNumber(10);
        assertEquals(mFizzBuzz.getEndNumber(), (Integer)(10));
    }

    public void testFizzBuzzZeroToFifteen() throws Exception {
        mFizzBuzz = new FizzBuzz(0, 15);

        String[] fizzBuzzList = {"0", "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        assertTrue(Arrays.deepEquals(mFizzBuzz.fizzBuzzes(), fizzBuzzList));
    }

    public void testFizzBuzzNegativeNumber() throws Exception {

        //Basically, we return fizzBuzzes between 0 and 100 whenever an invalid start/end number are declared
        FizzBuzz negativeStartFizzBuzz = new FizzBuzz(-20, 100);
        FizzBuzz defaultStartFizzBuzz = new FizzBuzz(0, 100);

        FizzBuzz negativeEndFizzBuzz = new FizzBuzz(10, -10);
        FizzBuzz defaultEndFizzBuzz = new FizzBuzz(0, 100);

        assertTrue(Arrays.deepEquals(negativeStartFizzBuzz.fizzBuzzes(), defaultStartFizzBuzz.fizzBuzzes()));
        assertTrue(Arrays.deepEquals(negativeEndFizzBuzz.fizzBuzzes(), defaultEndFizzBuzz.fizzBuzzes()));
    }

    @Override
    protected void tearDown() throws Exception {
        mFizzBuzz = null;
    }

}
