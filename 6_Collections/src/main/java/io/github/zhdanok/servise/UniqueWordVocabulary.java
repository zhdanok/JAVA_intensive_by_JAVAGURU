package io.github.zhdanok.servise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {

    static Logger logger = LoggerFactory.getLogger(UniqueWordVocabulary.class);

    static Set<String> voc = new HashSet<>();

    public static void addWord(String word) {
        if (!(voc.contains(word)) && !(word.equals(" "))) {
            voc.add(word);
        }
    }

    public static int getWordsCount(Set<String> voc) {
        return voc.size();
    }

    public static void printVocabulary(Set<String> voc) {
        for (String s : voc) {
            logger.info("{}", s);
        }
    }
}



