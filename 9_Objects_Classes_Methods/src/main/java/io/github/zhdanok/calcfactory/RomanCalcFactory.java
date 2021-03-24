package io.github.zhdanok.calcfactory;

public class RomanCalcFactory implements AbstractCalcFactory {
    @Override
    public Calculable createCalculator() {
        return new RomanCalc();
    }
}
