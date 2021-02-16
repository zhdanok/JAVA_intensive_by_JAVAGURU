package io.github.zhdanok.servise;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static  org.junit.jupiter.api.Assertions.*;


class WrappersTest {

    static Logger logger = LoggerFactory.getLogger(WrappersTest.class);

    @Test
    public void createWrapperWithConstructorAndValueOf() {
        Integer year1 = new Integer(2021);
        Double dollarRate1 = new Double(2.58);
        logger.info("The dollar rate is {} at the beginning of {}", dollarRate1, year1);
        Integer year2 = Integer.valueOf(2021);
        Double dollarRate2 = dollarRate1;
        assertEquals(year1, year2);
        assertNotSame(year1,year2);
        logger.info("two objects 'year1' and 'year2' have the equal values but different references");
        assertEquals(dollarRate1, dollarRate2, 3);
        assertSame(dollarRate1, dollarRate2);
        logger.info("two objects 'dollarRate1' and 'dollarRate2' have the equal values and references");
    }

    @Test
    public void createWrapperWithLiteralsAdnParse() {
        Byte day1 = new Byte("17");
        Float temperature1 = new Float("-14.2");
        logger.info("Fabruary {} temperature {} Celsius", day1, temperature1 );
        Byte day2 = Byte.parseByte("17");
        Float temperature2 = Float.parseFloat("-14.2");
        assertNotSame(day1, day2);
        assertEquals(temperature1, temperature2);
        logger.info("two objects have the equal values but different references");
    }

//todo выполнить пп 3,4,5

}