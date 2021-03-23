package io.github.zhdanok.callulator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class ArabianCalcTest {

    ArabianCalc arabianCalc;

    @BeforeEach
    void setUp() {
        arabianCalc = new ArabianCalc();
    }

    @Test
    void transformToCharArray() {
        char[] actual = arabianCalc.transformToCharArray("15+ 2");
        char[] expected = {'1', '5', '+', '2'};
        assertArrayEquals(expected, actual);
    }

    @Test
    void splitIntoComponentsTest() {
        char[] components = {'1', '5', '7', '+', '2'};
        String[] actual = new String[3];

        actual[0] = arabianCalc.extractLeftNumber(components);
        actual[1] = arabianCalc.extractSymbol(components);
        actual[2] = arabianCalc.extractRightNumber(components);
        String[] expected = {"157", "+", "2"};
        assertArrayEquals(expected, actual);
    }


}