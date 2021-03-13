package io.github.zhdanok.servise;

import io.github.zhdanok.exeptions.NegativNumberExeption;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class PowerCalculatorTest {

    PowerCalculator powerCalculator = new PowerCalculator();

    Logger logger = LoggerFactory.getLogger(PowerCalculatorTest.class);

    @Test
    void exponentiation() throws NegativNumberExeption {
         int actuale = powerCalculator.exp(3, 5);
         assertEquals(81, actuale);
         logger.info("3 ^ 5 = {}",actuale);

    }

    @Test
    void exponentiationExceptionThrows() {
        assertThrows(NegativNumberExeption.class, () -> {
            int actuale = powerCalculator.exp(-7, 5);
        });
        logger.warn("Negative number entered!");
    }

    @Test
    void exponentiationExceptionTryCatch() {
        try {
            int actuale = powerCalculator.exp(8, -2);
        } catch (NegativNumberExeption exeption) {
            exeption.printStackTrace();
        }


    }

}