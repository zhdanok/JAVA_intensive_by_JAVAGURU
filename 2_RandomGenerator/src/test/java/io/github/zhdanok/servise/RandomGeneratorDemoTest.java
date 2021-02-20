package io.github.zhdanok.servise;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class RandomGeneratorDemoTest {

    static Logger logger = LoggerFactory.getLogger(RandomGeneratorDemoTest.class);

    @Test
    public void ConsolOutput() {
        int a = -100;
        int b = 100;
        double [] expectedArray = RandomGeneratorDemo.generateArray(a,b);
        double [] actualeArray = RandomGeneratorDemo.consolOutputMethod(expectedArray);
        assertArrayEquals(expectedArray, actualeArray, 0.01);
        logger.info("The generated numbers are printed to the console");

    }

    @Test
    public void checkNumberOfNumbers() {
        int a = -100;
        int b = 100;
        int expected = 3;
        int actuale = RandomGeneratorDemo.generateArray(a, b).length;
        assertEquals(expected, actuale);
        logger.info("Number of numbers corresponds to the task. Expected = {}. Actuale = {}", expected, actuale);
    }

    @Test
    public void checkTheLimits_positive() {
        int a = -100;
        int b = 100;
        double [] arrayOfNumbers = RandomGeneratorDemo.generateArray(a,b);
        for (double num : arrayOfNumbers) {
            assertTrue(num > a);
            assertTrue(num < b);
        }
        logger.info("The numbers are within the given limits");
    }

    @Test(expected = AssertionError.class)
    public void checkTheLimits_negative() {
        int a = -100;
        int b = 100;
        double [] arrayOfNumbers = RandomGeneratorDemo.generateArray(a,b);
        arrayOfNumbers[2] = 150;
        for (double num : arrayOfNumbers) {
            assertTrue(num > a);
            assertTrue(num < b);
        }
    }

    @Test
    public void SumOfNumbers() {
        int a = -100;
        int b = 100;
        double[] expectedArray = RandomGeneratorDemo.generateArray(a, b);
        double expected = 0;
        for (double num : expectedArray) {
            expected = expected + num;
        }
        double actuale = RandomGeneratorDemo.consolOutputSum(expectedArray);
        assertEquals(expected, actuale, 0.01);
        logger.info("The sum of generated numbers is printed to the console");
    }



}