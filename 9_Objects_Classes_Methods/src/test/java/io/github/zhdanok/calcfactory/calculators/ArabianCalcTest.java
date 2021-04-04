package io.github.zhdanok.calcfactory.calculators;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ArabianCalcTest {

    ArabianCalc arabianCalc;

    @BeforeEach
    void setUp() {
        arabianCalc = new ArabianCalc();
    }

    @Test
    void addition() throws Exception {
        String actual = arabianCalc.selectionOfOperation("7", "+", "8");
        String expected = "15";
        assertEquals(expected, actual);
    }

    @Test
    void subtraction() throws Exception {
        String actual = arabianCalc.selectionOfOperation("7", "-", "8");
        String expected = "-1";
        assertEquals(expected, actual);
    }

    @Test
    void multiplication() throws Exception {
        String actual = arabianCalc.selectionOfOperation("7", "*", "8");
        String expected = "56";
        assertEquals(expected, actual);
    }

    @Test
    void division() throws Exception {
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
}