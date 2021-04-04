package io.github.zhdanok.calcfactory.facade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceTest {

    CalcService calcService;

    @BeforeEach
    void setUp() {
        calcService = new CalcService();
    }

    @Test
    void transformToCharArray() {
        char[] actual = calcService.transformToCharArray("1 +xI");
        char[] expected = {'1', '+', 'X', 'I'};
        assertArrayEquals(expected, actual);

    }

    @Test
    void extractIndexOfSymbol() {
        char[] strToChar = {'1', '+', 'X', 'I'};
        int actual = calcService.extractIndexOfSymbol(strToChar);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void extractSymbol() {
        char[] strToChar = {'1', '+', 'X', 'I'};
        String actual = calcService.extractSymbol(strToChar);
        String expected = "+";
        assertEquals(expected, actual);

    }

    @Test
    void extractLeftNumber() {
        char[] strToChar = {'1', '+', 'X', 'I'};
        String actual = calcService.extractLeftNumber(strToChar);
        String expected = "1";
        assertEquals(expected, actual);
    }

    @Test
    void extractRightNumber() {
        char[] strToChar = {'1', '+', 'X', 'I'};
        String actual = calcService.extractRightNumber(strToChar);
        String expected = "XI";
        assertEquals(expected, actual);
    }



    @Test
    void selectionOfCalculatorsTypeArabic() throws Exception {
        String actual = calcService.selectionOfCalculatorsType("7", "9");
        String expected = "arabic";
        assertEquals(expected, actual);
    }

    @Test
    void selectionOfCalculatorsTypeRoman() throws Exception {
        String actual = calcService.selectionOfCalculatorsType("III", "V");
        String expected = "roman";
        assertEquals(expected, actual);
    }

    @Test
    void selectionOfCalculatorsTypeIncorrectInput() throws Exception {
        Throwable e = assertThrows(Exception.class, () -> {
            String actual = calcService.selectionOfCalculatorsType("III", "6");
        });
        assertEquals("incorrect input", e.getMessage());
    }
}