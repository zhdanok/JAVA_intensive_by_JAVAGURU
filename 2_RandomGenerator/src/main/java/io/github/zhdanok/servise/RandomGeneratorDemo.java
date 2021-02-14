package io.github.zhdanok.servise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RandomGeneratorDemo {

    static Logger logger = LoggerFactory.getLogger(RandomGeneratorDemo.class);

    public static double[] generateArray(int a, int b) {
        double[] arrayOfNumders = new double[3];
        for (int i = 0; i < arrayOfNumders.length; i++) {
            arrayOfNumders[i] = (Math.random()*(b - a)) + a;
        }
        return arrayOfNumders;
    }

    public static double[] consolOutputMethod(double[] expectedArray) {
        for (int i = 0; i < expectedArray.length; i++) {
            logger.info("Generated number {} = {}", i, expectedArray[i]);
        }
        return expectedArray;

    }

    public static double consolOutputSum(double[] expectedArray) {
        double sum = expectedArray[0];
        for (int i = 1; i < expectedArray.length; i++) {
            sum = sum + expectedArray[i];
        }
        logger.info("The sum of generated numbers: {} + {} + {} = {}", expectedArray[0], expectedArray[1], expectedArray[2], sum);
        return sum;
    }
}
