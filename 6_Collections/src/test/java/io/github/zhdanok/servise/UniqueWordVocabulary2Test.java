package io.github.zhdanok.servise;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordVocabulary2Test {

    Logger logger = LoggerFactory.getLogger(UniqueWordVocabulary2Test.class);

    UniqueWordVocabulary2 unique = new UniqueWordVocabulary2();

    @Test
    void addWord() {
        for (String s : Arrays.asList("Mama", "Papa", "Misha", "Vanya")) {
            unique.addWord(s);
        }
        Set<String> act = Set.copyOf(unique.voc);
        logger.info("{}", act);
        Set<String> exp = Set.of("Mama", "Papa", "Misha", "Vanya");
        logger.info("{}", exp);
        assertIterableEquals(exp, act);
    }

    @Test
    void doNotAddDuplicate() {
        for (String s : Arrays.asList("Mama", "Papa", "Misha", "Vanya", "Papa", "Misha", "Vanya")) {
            unique.addWord(s);
        }
        Set<String> act = Set.copyOf(unique.voc);
        logger.info("{}", act);
        Set<String> exp = Set.of("Mama", "Papa", "Misha", "Vanya");
        assertIterableEquals(exp, act);
        logger.info("{}", exp);
    }

    @Test
    void doNotAddEmpty() {
        for (String s : Arrays.asList("Mama", "Papa", " ", "Vanya")) {
            unique.addWord(s);
        }
        Set<String> act = Set.copyOf(unique.voc);
        logger.info("{}", act);
        Set<String> exp = Set.of("Mama", "Papa", "Vanya");
        assertTrue(act.equals(exp));
        logger.info("{}", exp);
    }

    @Test
    void uniqueWordsCount() {
        for (String s : Arrays.asList("Mama", "Papa", "Misha", "Vanya", "Papa", "Misha", "Vanya")) {
            unique.addWord(s);
        }
        int act = unique.getWordsCount(unique.voc);
        int exp = 4;
        assertEquals(exp, act);
        logger.info("HashSet's {} size is {}", unique.voc, act);
    }

    @Test
    void printVoc() {
        for (String s : Arrays.asList("Mama", "Papa", "Misha", "Vanya")) {
            unique.addWord(s);
        }
        unique.printVocabulary(unique.voc);

    }
}





