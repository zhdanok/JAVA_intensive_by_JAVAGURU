package io.github.zhdanok.calcfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumberTest {

    RomanNumber romanNumber = new RomanNumber();

    @Test
    void toRomanTest() {
        String actual = romanNumber.toRoman(97);
        String expected = "XCVII";
        assertEquals(expected, actual);
    }
}