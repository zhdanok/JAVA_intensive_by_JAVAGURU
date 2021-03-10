package io.github.zhdanok.servise;

import io.github.zhdanok.exeptions.NegativNumberExeption;

public class PowerCalculator {

    public int exp(int number, int degree) throws NegativNumberExeption {
        if (number < 0 || degree < 0) {
            throw new NegativNumberExeption();
        }
        int result = 1;
        for (int i = 0; i < (degree - 1); i++) {
                result = result * number;
            }

        return result;
    }
}
