package io.github.zhdanok.calcfactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceTest {

    CalcService calcService = new CalcService();

    @Test
    void selectionOfTypeArabic() throws Exception {
        String actual = calcService.selectionOfCalculatorsType("9", "5");
        String expected = "arabic";
        assertEquals(expected, actual);

    }

    @Test
    void selectionOfTypeRoman() throws Exception {
        String actual = calcService.selectionOfCalculatorsType("II", "IV");
        String expected = "roman";
        assertEquals(expected, actual);
    }

    @Test
    void selectionOfTypeNotEqualsType() {
        Throwable e = assertThrows(Exception.class, () -> {
            String actual = calcService.selectionOfCalculatorsType("II", "4");
        });
        assertEquals("incorrect input", e.getMessage());
    }

    @Test
    void selectionOfTypeInputExeption() {
        Throwable e = assertThrows(Exception.class, () -> {
            String actual = calcService.selectionOfCalculatorsType("II", "d");
        });
        assertEquals("incorrect input", e.getMessage());
    }

    @Test
    void transformToCharArray() {
        char[] actual = calcService.transformToCharArray("10+ 2");
        char[] expected = {'1', '0', '+', '2'};
        assertArrayEquals(expected, actual);
    }

    @Test
    void splitIntoComponentsTest() {
        char[] components = {'1', '0', '+', '2'};
        String[] actual = new String[3];

        actual[0] = calcService.extractLeftNumber(components);
        actual[1] = calcService.extractSymbol(components);
        actual[2] = calcService.extractRightNumber(components);
        String[] expected = {"10", "+", "2"};
        assertArrayEquals(expected, actual);
    }




}