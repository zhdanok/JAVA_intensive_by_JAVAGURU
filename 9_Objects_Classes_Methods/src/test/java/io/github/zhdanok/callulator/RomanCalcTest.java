package io.github.zhdanok.callulator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanCalcTest {

    RomanCalc romanCalc;

    @BeforeEach
    void setUp() {
        romanCalc = new RomanCalc();
    }

    @Test
    void transformToCharArray() {
        char[] actual = romanCalc.transformToCharArray("IV+ III");
        char[] expected = {'I', 'V', '+', 'I', 'I', 'I'};
        assertArrayEquals(expected, actual);
    }

    @Test
    void transformToCharArrayLowerCase() {
        char[] actual = romanCalc.transformToCharArray("Iv+ II I");
        char[] expected = {'I', 'V', '+', 'I', 'I', 'I'};
        assertArrayEquals(expected, actual);
    }

    @Test
    void splitIntoComponentsTest() {
        char[] components = {'I', 'V', '+', 'I', 'I', 'I'};
        String[] actual = new String[3];

        actual[0] = romanCalc.extractLeftNumber(components);
        actual[1] = romanCalc.extractSymbol(components);
        actual[2] = romanCalc.extractRightNumber(components);
        String[] expected = {"4", "+", "3"};
        assertArrayEquals(expected, actual);
    }




}