package io.github.zhdanok.calcfactory;

public class ArabianCalcFactory  implements  AbstractCalcFactory{

    @Override
    public Calculable createCalculator() {
        return new ArabianCalc();
    }
}
