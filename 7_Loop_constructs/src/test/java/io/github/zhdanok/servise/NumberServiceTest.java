package io.github.zhdanok.servise;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {

    NumberService numberService = new NumberService();

    Logger logger = LoggerFactory.getLogger(NumberServiceTest.class);

    @Test
    void AllNumbersInRange() {
        int a = 7;
        int b = 12;
        int actuale = numberService.allNumbersInRange(a, b);
        int expected = 57;
        assertEquals(expected, actuale);
        logger.info("Sum of numbers between {} and {} is {}", a, b, actuale);
    }

    @Test
    void AllNumbersInRangeSwap() {
        int a = 10;
        int b = 2;
        int actuale = numberService.allNumbersInRange(a, b);
        int expected = 54;
        assertEquals(expected, actuale);
        logger.info("Sum of numbers between {} and {} is {}", a, b, actuale);
    }

    @Test
    void AllNumbersInRangeEqual() {
        int a = 5;
        int b = 5;
        int actuale = numberService.allNumbersInRange(a, b);
        int expected = 5;
        assertEquals(expected, actuale);
        logger.info("Sum of numbers between {} and {} is {}", a, b, actuale);
    }



    @Test
    void OddNumbersInRange() {
        int a = 7;
        int b = 12;
        int actuale = numberService.oddNumbersInRange(a, b);
        int expected = 30;
        assertEquals(expected, actuale);
        logger.info("Sum of odd numbers between {} and {} is {}", a, b, actuale);
    }
    @Test
    void OddNumbersInRangeSwap() {
        int a = 50;
        int b = 43;
        int actuale = numberService.oddNumbersInRange(a, b);
        int expected = 188;
        assertEquals(expected, actuale);
        logger.info("Sum of odd numbers between {} and {} is {}", a, b, actuale);
    }

    @Test
    void OddNumbersInRangeEqual() {
        int a = 30;
        int b = 30;
        int actuale = numberService.oddNumbersInRange(a, b);
        int expected = 30;
        assertEquals(expected, actuale);
        logger.info("Sum of odd numbers between {} and {} is {}", a, b, actuale);
    }

    @Test
    void OddNumbersInRangeEqualZero() {
        int a = 7;
        int b = 7;
        int actuale = numberService.oddNumbersInRange(a, b);
        int expected = 0;
        assertEquals(expected, actuale);
        logger.info("Sum of odd numbers between {} and {} is {}", a, b, actuale);
    }

}