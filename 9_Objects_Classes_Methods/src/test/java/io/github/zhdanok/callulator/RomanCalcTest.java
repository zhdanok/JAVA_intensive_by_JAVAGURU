package io.github.zhdanok.callulator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanCalcTest {

    /*RomanCalc romanCalc;

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

    @Test
    void additionTest() throws Exception {
        String actual = romanCalc.selectionOfOperation("1", "+", "1");
        String expected = "II";
        assertEquals(expected, actual);
    }

    @Test
    void subtractionTest() throws Exception {
        String actual = romanCalc.selectionOfOperation("8", "-", "7");
        String expected = "I";
        assertEquals(expected, actual);
    }

    @Test
    void multiplicationTest() throws Exception {
        String actual = romanCalc.selectionOfOperation("2", "*", "3");
        String expected = "VI";
        assertEquals(expected, actual);
    }

    @Test
    void divisionTest() throws Exception {
        String actual = romanCalc.selectionOfOperation("8", "/", "2");
        String expected = "IV";
        assertEquals(expected, actual);
    }

    @Test
    void divisionTestResultNotInteger() {
        Throwable e = assertThrows(Exception.class, () -> {
            String actual = romanCalc.selectionOfOperation("9", "/", "2");
        });
        assertEquals("Result is not integer number. Please change parameters", e.getMessage());

    }

    @Test
    void anotherOperationTest() throws Exception {
        String actual = romanCalc.selectionOfOperation("8", "%", "2");
        String expected = "Данная операция недоступна";
        assertEquals(expected, actual);
    }

*/


}