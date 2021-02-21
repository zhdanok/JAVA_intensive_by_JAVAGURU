package io.github.zhdanok.servise;

public class SignComparator {
    public static String compare(Double a) {
        if (a > 0.) {
            return "Number is positive";
        } else if (a < 0.) {
            return "Number is negative";
        } else
            return "Number is equal to zero";
    }
}
