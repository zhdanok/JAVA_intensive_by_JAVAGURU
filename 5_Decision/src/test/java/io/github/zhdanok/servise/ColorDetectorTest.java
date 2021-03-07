package io.github.zhdanok.servise;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class ColorDetectorTest {

    Logger logger = LoggerFactory.getLogger(ColorDetectorTest.class);

    @Test
    void detectV() {
        int wavelength = 410;
        String actuale = ColorDetector.detect(wavelength);
        String expected = "Violet";
        assertEquals(expected, actuale);
        logger.info("Wavelenth {} equales {} color", wavelength, actuale);
    }

    @Test
    void detectB() {
        int wavelength = 450;
        String actuale = ColorDetector.detect(wavelength);
        String expected = "Blue";
        assertEquals(expected, actuale);
        logger.info("Wavelenth {} equales {} color", wavelength, actuale);
    }

    @Test
    void detectG() {
        int wavelength = 569;
        String actuale = ColorDetector.detect(wavelength);
        String expected = "Green";
        assertEquals(expected, actuale);
        logger.info("Wavelenth {} equales {} color", wavelength, actuale);
    }

    @Test
    void detectY() {
        int wavelength = 580;
        String actuale = ColorDetector.detect(wavelength);
        String expected = "Yellow";
        assertEquals(expected, actuale);
        logger.info("Wavelenth {} equales {} color", wavelength, actuale);
    }

    @Test
    void detectO() {
        int wavelength = 618;
        String actuale = ColorDetector.detect(wavelength);
        String expected = "Orange";
        assertEquals(expected, actuale);
        logger.info("Wavelenth {} equales {} color", wavelength, actuale);
    }

    @Test
    void detectR() {
        int wavelength = 730;
        String actuale = ColorDetector.detect(wavelength);
        String expected = "Red";
        assertEquals(expected, actuale);
        logger.info("Wavelenth {} equales {} color", wavelength, actuale);
    }

    @Test
    void detectIL1() {
        int wavelength = 0;
        String actuale = ColorDetector.detect(wavelength);
        String expected = "Invisible Light";
        assertEquals(expected, actuale);
        logger.info("Wavelenth {} equales {} color", wavelength, actuale);
    }

    @Test
    void detectIL2() {
        int wavelength = 1500;
        String actuale = ColorDetector.detect(wavelength);
        String expected = "Invisible Light";
        assertEquals(expected, actuale);
        logger.info("Wavelenth {} equales {} color", wavelength, actuale);
    }

    @Test
    void detectNegative() {
        int wavelength = -85;
        String actuale = ColorDetector.detect(wavelength);
        String expected = "impossible wavelength";
        assertEquals(expected, actuale);
        logger.info("Wavelenth {} is impossible", wavelength);
    }


}