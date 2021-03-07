package io.github.zhdanok.servise;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OddCheckerTest {


    OddChecker oddChecker = new OddChecker();

    List<Integer> expected = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49);

    @Test
    void forOddChecker() {
        List<Integer> actuale = oddChecker.forOddChecker();
        assertEquals(expected, actuale);

    }

    @Test
    void whileOddChecker() {
        List<Integer> actuale = oddChecker.whileOddChecker();
        assertEquals(expected, actuale);

    }

    @Test
    void doWhileOddChecker() {
        List<Integer> actuale = oddChecker.dowhileOddChecker();
        assertEquals(expected, actuale);

    }
}