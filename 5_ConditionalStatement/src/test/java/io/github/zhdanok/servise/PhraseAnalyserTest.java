package io.github.zhdanok.servise;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class PhraseAnalyserTest {

    Logger logger = LoggerFactory.getLogger(PhraseAnalyserTest.class);

    @Test
    void analysePositive() {
        String str = "Don't worry, be happy!";
        String actuale = PhraseAnalyser.analyse(str);
        String expected = "It is fine, really";
        assertEquals(expected, actuale);
        logger.info("{} - {}", str, actuale);
    }

    @Test
    void analyseNeutralWithMake() {
        String str = "Make the world a better place!";
        String actuale = PhraseAnalyser.analyse(str);
        String expected = "It could be worse";
        assertEquals(expected, actuale);
        logger.info("{} - {}", str, actuale);
    }

    @Test
    void analyseNeutralWithGreateAgain() {
        String str = "You look great again";
        String actuale = PhraseAnalyser.analyse(str);
        String expected = "It could be worse";
        assertEquals(expected, actuale);
        logger.info("{} - {}", str, actuale);
    }

    @Test
    void analyseNegative() {
        String str = "Make youself great again";
        String actuale = PhraseAnalyser.analyse(str);
        String expected = "It stands no chance";
        assertEquals(expected, actuale);
        logger.info("{} - {}", str, actuale);
    }

}