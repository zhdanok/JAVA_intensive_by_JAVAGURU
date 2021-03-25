package io.github.zhdanok.calcfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {

    static Logger logger = LoggerFactory.getLogger(Demo.class);

    public static Application configureApplication(String resultOfSelection) throws Exception {
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
