package io.github.zhdanok.easy_diagonal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasyDiagonalServiceTest {

    EasyDiagonal easyDiagonal;
    EasyDiagonalService easyDiagonalService;

    @BeforeEach
    void setUp() {
        easyDiagonal = new EasyDiagonal();
        easyDiagonalService = new EasyDiagonalService();
    }

    @Test
    void checkTheValues() {
        easyDiagonal.setN(9);
        easyDiagonal.setP(8);
        boolean actual = easyDiagonalService.isValueCorrect(easyDiagonal.getN(), easyDiagonal.getP());
        assertTrue(actual);
    }

    @Test
    void checkTheValuesNegative() {
        easyDiagonal.setN(5);
        easyDiagonal.setP(8);
        boolean actual1 = easyDiagonalService.isValueCorrect(easyDiagonal.getN(), easyDiagonal.getP());
        assertFalse(actual1);

        easyDiagonal.setN(-7);
        easyDiagonal.setP(8);
        boolean actual2 = easyDiagonalService.isValueCorrect(easyDiagonal.getN(), easyDiagonal.getP());
        assertFalse(actual2);

        easyDiagonal.setN(5);
        easyDiagonal.setP(0);
        boolean actual3 = easyDiagonalService.isValueCorrect(easyDiagonal.getN(), easyDiagonal.getP());
        assertFalse(actual3);
    }

    @Test
    void calculateS1() {
        easyDiagonal.setN(7);
        easyDiagonal.setP(2);
        int actual = easyDiagonalService.calculateS(easyDiagonal.getN(), easyDiagonal.getP());
        int expected = 56;
        assertEquals(expected, actual);
    }

    @Test
    void calculateS2() {
        easyDiagonal.setN(20);
        easyDiagonal.setP(4);
        int actual = easyDiagonalService.calculateS(easyDiagonal.getN(), easyDiagonal.getP());
        int expected = 20349;
        assertEquals(expected, actual);
    }

    @Test
    void calculateS3Exception() {
        easyDiagonal.setN(1);
        easyDiagonal.setP(4);
        Throwable e = assertThrows(IllegalArgumentException.class, () -> {
            int actual = easyDiagonalService.calculateS(easyDiagonal.getN(), easyDiagonal.getP());
        });
        assertEquals(" Invalid input! ", e.getMessage());

    }
}