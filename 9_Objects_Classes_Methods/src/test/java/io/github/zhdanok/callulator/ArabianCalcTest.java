package io.github.zhdanok.callulator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ArabianCalcTest {

    /*ArabianCalc arabianCalc;

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


    @Test
    void additionTest() throws Exception {
        String actual = arabianCalc.selectionOfOperation("7", "+", "8");
        String expected = "15";
        assertEquals(expected, actual);
    }

    @Test
    void subtractionTest() throws Exception {
        String actual = arabianCalc.selectionOfOperation("7", "-", "8");
        String expected = "-1";
        assertEquals(expected, actual);
    }

    @Test
    void multiplicationTest() throws Exception {
        String actual = arabianCalc.selectionOfOperation("7", "*", "8");
        String expected = "56";
        assertEquals(expected, actual);
    }

    @Test
    void divisionTest() throws Exception {
        String actual = arabianCalc.selectionOfOperation("8", "/", "2");
        String expected = "4";
        assertEquals(expected, actual);
    }

    @Test
    void divisionTestResultNotInteger() {
        Throwable e = assertThrows(Exception.class, () -> {
            String actual = arabianCalc.selectionOfOperation("9", "/", "2");
        });
        assertEquals("Result is not integer number. Please change parameters", e.getMessage());

    }

    @Test
    void anotherOperationTest() throws Exception {
        String actual = arabianCalc.selectionOfOperation("8", "%", "2");
        String expected = "Данная операция недоступна";
        assertEquals(expected, actual);
    }
}*/
}