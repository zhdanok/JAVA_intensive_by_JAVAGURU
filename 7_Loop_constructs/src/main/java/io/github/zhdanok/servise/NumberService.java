package io.github.zhdanok.servise;

public class NumberService {
    public int allNumbersInRange(int a, int b) {
        int sum = 0;
        if (b < a) {
            int buf = b;
            b = a;
            a = buf;
        }
        for (int i = a; i <= b; i++) {
                sum += i;
            }
        return sum;
    }

    public int oddNumbersInRange(int a, int b) {
        int sum = 0;
        if (b < a) {
            int buf = b;
            b = a;
            a = buf;
        }
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;

    }
}
