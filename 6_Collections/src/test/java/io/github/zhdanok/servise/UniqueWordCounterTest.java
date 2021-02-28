package io.github.zhdanok.servise;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordCounterTest {

    Logger logger = LoggerFactory.getLogger(UniqueWordCounterTest.class);

    @Test
    void addWord() {
        UniqueWordCounter.directory.clear();
        for (String s : Arrays.asList(
                "apple",
                "orange",
                "apple",
                "grape",
                "potato",
                "potato",
                "pineapple",
                "potato",
                "potato")) {
            UniqueWordCounter.addWord(s);
        }
        Map<String, Integer> exp = new HashMap<>();
        exp.put("apple", 2);
        exp.put("orange", 1);
        exp.put("grape", 1);
        exp.put("potato", 4);
        exp.put("pineapple", 1);
        assertTrue(exp.equals(UniqueWordCounter.directory));
    }

    @Test
    void getMostFrequentWord() {
        UniqueWordCounter.directory.clear();
        for (String s : Arrays.asList(
                "apple",
                "orange",
                "apple",
                "grape",
                "potato",
                "potato",
                "pineapple",
                "potato",
                "potato")) {
            UniqueWordCounter.addWord(s);
        }
        String act = UniqueWordCounter.getMostFrequentWord();
        String exp = "potato";
        assertEquals(exp, act);
        logger.info("The most frequent word is {}", act);
    }

    @Test
    void printWordsFrequency() {
        UniqueWordCounter.directory.clear();
        for (String s : Arrays.asList(
                "apple",
                "orange",
                "apple",
                "grape",
                "potato",
                "potato",
                "pineapple",
                "potato",
                "potato")) {
            UniqueWordCounter.addWord(s);
        }
        UniqueWordCounter.printWordsFrequency();
    }
}