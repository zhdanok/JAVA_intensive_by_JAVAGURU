package io.github.zhdanok.servise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary2 {

    Logger logger = LoggerFactory.getLogger(UniqueWordVocabulary2.class);

    Set<String> voc = new HashSet<>();

    public void addWord(String word) {
        if (!(voc.contains(word)) && !(word.equals(" "))) {
            voc.add(word);
        }
    }

    public int getWordsCount(Set<String> voc) {
        return voc.size();
    }

    public void printVocabulary(Set<String> voc) {
        for (String s : voc) {
            logger.info("{}", s);
        }
    }
}

