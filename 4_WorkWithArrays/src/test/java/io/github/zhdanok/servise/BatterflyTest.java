package io.github.zhdanok.servise;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class BatterflyTest {


    @Test
    void generateArray() {
        int l = 7;
        int s = 7;
        int[][] emptyArray = Batterfly.generateArray(l, s);
        assertEquals(emptyArray.length, 7);
        assertEquals(emptyArray[0].length, 7);
    }

    @Test
    void paintBatterflyOdd() {
        int l = 7;
        int s = 7;
        int[][] emptyArray = Batterfly.generateArray(l, s);
        int[][] actuale = Batterfly.paintBatterfly(emptyArray);
        for (int i = 0; i < actuale.length; i++) {
            for (int j = 0; j < actuale[i].length; j++) {
                System.out.print(actuale[i][j] + "\t");
            }
            System.out.println();
        }
    }

    @Test
    void paintBatterflyEven() {
        int l = 8;
        int s = 8;
        int[][] emptyArray = Batterfly.generateArray(l, s);
        int[][] actuale = Batterfly.paintBatterfly(emptyArray);
        for (int i = 0; i < actuale.length; i++) {
            for (int j = 0; j < actuale[i].length; j++) {
                System.out.print(actuale[i][j] + "\t");
            }
            System.out.println();
        }
    }


}