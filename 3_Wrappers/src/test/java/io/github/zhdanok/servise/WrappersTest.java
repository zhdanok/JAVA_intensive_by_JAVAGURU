package io.github.zhdanok.servise;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;


class WrappersTest {

    static Logger logger = LoggerFactory.getLogger(WrappersTest.class);

    @Test
    void createWrapperWithConstructorAndValueOf() {
        Integer year1 = new Integer(2021);
        Double dollarRate1 = new Double(2.58);
        logger.info("The dollar rate is {} at the beginning of {}", dollarRate1, year1);
        Integer year2 = Integer.valueOf(2021);
        Double dollarRate2 = dollarRate1;
        assertEquals(year1, year2);
        assertNotSame(year1, year2);
        logger.info("two objects 'year1' and 'year2' have the equal values but different references");
        assertEquals(dollarRate1, dollarRate2, 3);
        assertSame(dollarRate1, dollarRate2);
        logger.info("two objects 'dollarRate1' and 'dollarRate2' have the equal values and references");
    }

    @Test
    void createWrapperWithLiteralsAndParse() {
        Byte day1 = new Byte("17");
        Float temperature1 = new Float("-14.2");
        logger.info("Fabruary {} temperature {} Celsius", day1, temperature1);
        Byte day2 = Byte.parseByte("17");
        Float temperature2 = Float.parseFloat("-14.2");
        assertFalse(day1 == day2);
        assertTrue(temperature1.equals(temperature2));
        logger.info("two objects have the equal values but different references");
    }

    @Test
    void convertToBinary() {
        Integer a = 25;
        String binary = "11001";
        String actuale = Integer.toBinaryString(a);
        assertEquals(binary, actuale);
        logger.info("The number {} in the binary system is {}", a, actuale);
    }

    @Test
    void convertToOctal() {
        Integer a = 89;
        String octal = "131";
        String actuale = Integer.toOctalString(a);
        assertEquals(octal, actuale);
        logger.info("The number {} in the octal system is {}", a, actuale);
    }

    @Test
    void convertToHexademical() {
        Integer a = 1569;
        String hex = "621";
        String actuale = Integer.toHexString(a);
        assertEquals(hex, actuale);
        logger.info("The number {} in the hexademical system is {}", a, actuale);
    }

    @Test
    void convertToString() {
        Double a = 258.78;
        String str = "258.78";
        String actuale = Double.toString(a);
        assertEquals(str, actuale);
        logger.info("The number {} has been converted to String", a);
    }

    @Test
    void compareInCache() {
        Byte x = 127;
        Byte y = 127;
        assertEquals(x, y);
        assertSame(x, y);
        logger.info("Numbers within the cache have the equal values and references");
    }

    @Test
    void compareOutOfCache() {
        Integer a = 250;
        Integer b = 250;
        assertEquals(a, b);
        assertNotSame(a, b);
        logger.info("Numbers out of the cache have the equal values but different references");
    }

    @Test
    void testThatWrappersAreConstants() {
        Integer x = 1987;
        Integer y = new Integer(x);
        logger.info("x = {}, y = {}", x, y);
        x = Wrappers.addition(x, 33);
        Integer expected = 2020;
        assertEquals(expected, x);
        assertNotEquals(expected, y);
        logger.info("x = {}, y = {}", x, y);
    }

    @Test
    void addition() {
        Integer a = 5;
        int b = 7;
        Integer expected = 12;
        Integer actuale = Wrappers.addition(a, b);
        assertEquals(expected, actuale);
        logger.info("{} + {} = {}", a, b, actuale);
    }

}