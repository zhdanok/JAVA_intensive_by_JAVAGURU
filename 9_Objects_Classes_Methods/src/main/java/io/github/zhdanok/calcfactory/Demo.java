package io.github.zhdanok.calcfactory;

import io.github.zhdanok.calcfactory.facade.FacadeCalc;
import io.github.zhdanok.calcfactory.factories.AbstractCalcFactory;
import io.github.zhdanok.calcfactory.factories.ArabianCalcFactory;
import io.github.zhdanok.calcfactory.factories.RomanCalcFactory;


public class Demo {

    public static Application configureApplication(String resultOfSelection) {
        Application app;
        AbstractCalcFactory factory;

        if (resultOfSelection.equals("arabic")) {
            factory = new ArabianCalcFactory();
            app = new Application(factory);
        } else {
            factory = new RomanCalcFactory();
            app = new Application(factory);
        }
        return app;

    }

    public static void main(String[] args) throws Exception {

        FacadeCalc facadeCalc = new FacadeCalc();
        facadeCalc.startCalc();

    }
}
