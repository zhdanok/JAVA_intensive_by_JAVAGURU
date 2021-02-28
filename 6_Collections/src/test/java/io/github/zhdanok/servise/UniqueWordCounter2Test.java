package io.github.zhdanok.servise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordCounter2Test {

    Logger logger = LoggerFactory.getLogger(UniqueWordCounter2Test.class);

    UniqueWordCounter2 uniqueWord = new UniqueWordCounter2();

    @BeforeEach
    void beforeTest() {
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
            uniqueWord.addWord(s);
        }
    }

    @Test
    void addWord() {
        Map<String, Integer> exp = new HashMap<>();
        exp.put("apple", 2);
        exp.put("orange", 1);
        exp.put("grape", 1);
        exp.put("potato", 4);
        exp.put("pineapple", 1);
        assertTrue(exp.equals(uniqueWord.directory));
    }

    @Test
    void getMostFrequentWord() {
        String act = uniqueWord.getMostFrequentWord();
        String exp = "potato";
        assertEquals(exp, act);
        logger.info("The most frequent word is {}", act);
    }

    @Test
    void printWordsFrequency() {
        uniqueWord.printWordsFrequency();
    }
}