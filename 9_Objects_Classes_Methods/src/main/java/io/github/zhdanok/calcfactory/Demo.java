package io.github.zhdanok.calcfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Demo {

    static Logger logger = LoggerFactory.getLogger(Demo.class);

    public static Application configureApplication() throws IOException {
        Application app;
        AbstractCalcFactory factory;

        logger.info("Выберети калькулятор: 1.арабский 2.римский");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(reader.readLine());

        if (answer == 1) {
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
//todo покрыть тестами, разработать конвертер в арабские цифры больше 10


}
