package io.github.zhdanok.servise;

public class Batterfly {

    public static int[][] generateArray(int l, int s) {
        return new int[l][s];
    }

    public static int[][] paintBatterfly(int[][] batterfly) {

        for (int i = 0; i < batterfly.length / 2 + 1; i++) {
            for (int j = 0 + i; j < batterfly[0].length - i; j++) {
                batterfly[i][j] = 1;
                batterfly[batterfly.length - 1 - i][j] = 1;
            }
        }

        return batterfly;
    }
}
