package io.github.zhdanok.servise;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CopyArrayTest {

    Logger logger = LoggerFactory.getLogger(CopyArrayTest.class);

    @Test
    void copyInRange() {
        int[] arrayForExample = {12, 34, -17, 0, 55, 89, 159, 12356, 66, 66, 78, 587, 3, -47, 0};
        int a = 0;
        int b = 250;
        int[] actuale;
        actuale = CopyArray.copyInRange(arrayForExample, a, b);
        int[] expected = {12, 34, 0, 55, 89, 159, 66, 66, 78, 3, 0};
        assertArrayEquals(expected, actuale);
        logger.info("Initial array {}", arrayForExample);
        logger.info("New array {}", actuale);
    }

    @Test
    void copyInRangeIfNewArrayIsEmpty() {
        int[] arrayForExample = {12, 34, -17, 0, 55, 89, 159, 12356, 66, 66, 78, 587, 3, -47, 0};
        int a = -250;
        int b = -50;
        int[] actuale;
        actuale = CopyArray.copyInRange(arrayForExample, a, b);
        int[] expected = new int[0];
        assertArrayEquals(expected, actuale);
        logger.info("Initial array {}", arrayForExample);
        logger.info("No match in the given range [{}, {}]", a, b);
    }

}