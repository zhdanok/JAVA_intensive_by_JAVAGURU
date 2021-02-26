package io.github.zhdanok.servise;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class SignComparatorTest {

    Logger logger = LoggerFactory.getLogger(SignComparatorTest.class);

    @Test
    void compareIsPositive() {
        Double a = 128.8;
        String actuale = SignComparator.compare(a);
        String expected = "Number is positive";
        assertEquals(expected, actuale);
        logger.info("Number {} is positive", a);
    }

    @Test
    void compareIsNegative() {
        Double a = -89.6;
        String actuale = SignComparator.compare(a);
        String expected = "Number is negative";
        assertEquals(expected, actuale);
        logger.info("Number {} is negative", a);
    }

    @Test
    void compareIsZero() {
        Double a = 0.;
        String actuale = SignComparator.compare(a);
        String expected = "Number is equal to zero";
        assertEquals(expected, actuale);
        logger.info("Number {} is equal to zero", a);
    }


}