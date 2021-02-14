package io.github.zhdanok.servise;

import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import static org.junit.Assert.assertEquals;

public class MathOperationDemoTest {

    static Logger logger = LoggerFactory.getLogger(MathOperationDemoTest.class);

    @Test
    public void addition() {
        double a = 3.4;
        double b = 5.23;
        double expected = 8.63;
        double actuale = MathOperationDemo.addition(a, b);
        assertEquals(expected, actuale, 0.01);
        logger.info("Addition: a + b = {} + {} = {}", a, b, actuale);
    }

    @Test
    public void multiplication() {
        double c = 7;
        double d = 4.3;
        double expected = 30.1;
        double actuale = MathOperationDemo.multiplication(c, d);
        assertEquals(expected, actuale, 0.01);
        logger.info("Multiplication: c * d = {} * {} = {}", c, d, actuale);
    }

    @Test
    public void subtraction() {
        double x = 3.49;
        double y = 15;
        double expected = -11.51;
        double actuale = MathOperationDemo.subtraction(x, y);
        assertEquals(expected, actuale, 0.01);
        logger.info("Subtraction: x - y = {} - {} = {}", x, y, actuale);
    }

    @Test
    public void division() {
        double x = 29;
        double y = 3;
        double expected = 9.66;
        if (y == 0) {
            logger.warn("Division by zero {} / {} is impossible", x, y);
        }
        else {
            double actuale = MathOperationDemo.division(x, y);
            assertEquals(expected, actuale, 0.01);
            logger.info("Division: x / y = {} / {} = {}", x, y, actuale);
        }
    }

    @Test
    public void divisionByZero() {
        double x = 29;
        double y = 0;
        double expected = 0;
        if (y == 0) {
            logger.warn("Division by zero {} / {} is impossible", x, y);
        }
        else {
            double actuale = MathOperationDemo.division(x, y);
            assertEquals(expected, actuale, 0.01);
            logger.info("Division: x / y = {} / {} = {}", x, y, actuale);
        }
    }



    @Test
    public void reminder() {
        double x = 19;
        double y = 2;
        double expected = 1;
        double actuale = MathOperationDemo.reminder(x, y);
        assertEquals(expected, actuale, 0.01);
        logger.info("Reminder: x % y = {} % {} = {}", x, y, actuale);
    }



}