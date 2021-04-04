package io.github.zhdanok.calcfactory.factories;

import io.github.zhdanok.calcfactory.calculators.ArabianCalc;
import io.github.zhdanok.calcfactory.calculators.Calculable;

public class ArabianCalcFactory  implements  AbstractCalcFactory{

    @Override
    public Calculable createCalculator() {
        return new ArabianCalc();
    }
}
