package io.github.zhdanok.servise;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UniqueWordCounter2 {

    Logger logger = LoggerFactory.getLogger(UniqueWordCounter2.class);


    Map<String, Integer> directory = new HashMap<>();

    public void addWord(String s) {
        if (directory.containsKey(s)) {
            Integer i = directory.get(s) + 1;
            directory.put(s, i);
        } else {
            directory.put(s, 1);
        }
    }

    public String getMostFrequentWord() {
        Integer maxValue = 0;
        String maxKey = "HashMap is empty";
        for (Map.Entry<String, Integer> entry : directory.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (value > maxValue) {
                maxKey = key;
                maxValue = value;
            }
        }
        return maxKey;
    }

    public void printWordsFrequency() {
        for (Map.Entry<String, Integer> entry : directory.entrySet()) {
            logger.info("{} = {}", entry.getKey(), entry.getValue());
        }
    }
}