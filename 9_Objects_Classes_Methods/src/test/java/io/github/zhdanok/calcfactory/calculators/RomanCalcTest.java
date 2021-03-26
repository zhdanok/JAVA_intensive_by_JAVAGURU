package io.github.zhdanok.calcfactory.calculators;

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
    void additionTest() throws Exception {
        String actual = romanCalc.selectionOfOperation("II", "+", "IV");
        String expected = "VI";
        assertEquals(expected, actual);
    }

    @Test
    void subtractionTest() throws Exception {
        String actual = romanCalc.selectionOfOperation("V", "-", "VII");
        String expected = "-II";
        assertEquals(expected, actual);
    }

    @Test
    void multiplicationTest() throws Exception {
        String actual = romanCalc.selectionOfOperation("III", "*", "IV");
        String expected = "XII";
        assertEquals(expected, actual);
    }

    @Test
    void divisionTest() throws Exception {
        String actual = romanCalc.selectionOfOperation("VIII", "/", "II");
        String expected = "IV";
        assertEquals(expected, actual);
    }

    @Test
    void divisionTestResultNotInteger() {
        Throwable e = assertThrows(Exception.class, () -> {
            String actual = romanCalc.selectionOfOperation("IX", "/", "II");
        });
        assertEquals("Result is not integer number. Please change parameters", e.getMessage());

    }

    @Test
    void anotherOperationTest() throws Exception {
        String actual = romanCalc.selectionOfOperation("VIII", "%", "II");
        String expected = "Данная операция недоступна";
        assertEquals(expected, actual);
    }

    @Test
    void transformToArabianNumerals() {
        int actual = romanCalc.transformToArabianNumerals("IX");
        int expected = 9;
        assertEquals(expected, actual);

    }


    @Test
    void transformToRomanNumerals() {
        String actual = romanCalc.transformToRomanNumerals(28);
        String expected = "XXVIII";
        assertEquals(expected, actual);
    }
}