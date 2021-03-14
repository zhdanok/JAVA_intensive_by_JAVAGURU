package io.github.zhdanok.servise;

public class CopyArray {



    public static int[] copyInRange(int[] example, int a, int b) {
        int size = 0;
        for (int x : example) {
            if (x >= a && x <= b) {
                size++;
            }
        }
        if (size == 0) {
            return new int[0];
        } else {
            int[] actuale = new int[size];
            int j = 0;
            for (int i = 0; i < example.length; i++) {
                if (example[i] >= a && example[i] <= b) {
                    actuale[j] = example[i];
                    j++;
                }
            }
            return actuale;
        }

    }
}
