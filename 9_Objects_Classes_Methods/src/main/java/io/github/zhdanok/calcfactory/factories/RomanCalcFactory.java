package io.github.zhdanok.calcfactory.factories;

import io.github.zhdanok.calcfactory.calculators.Calculable;
import io.github.zhdanok.calcfactory.calculators.RomanCalc;

public class RomanCalcFactory implements AbstractCalcFactory {
    @Override
    public Calculable createCalculator() {
        return new RomanCalc();
    }
}
