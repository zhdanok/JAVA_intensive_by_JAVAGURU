package io.github.zhdanok.servise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class OddChecker {

    Logger log = LoggerFactory.getLogger(OddChecker.class);

    public List<Integer> forOddChecker() {
        List<Integer> oddList = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 1) {
                oddList.add(i);
            }
        }
        log.info("{} - Loop For", oddList);
        return oddList;
    }

    public List<Integer> whileOddChecker() {
        List<Integer> oddList = new ArrayList<>();
        int i = 0;
        while (i <= 50) {
            if (i % 2 == 1) {
                oddList.add(i);
            }
            i++;
        }
        log.info("{} - Loop While", oddList);
        return oddList;
    }

    public List<Integer> dowhileOddChecker() {
        List<Integer> oddList = new ArrayList<>();
        int i = 0;
        do {
            if (i % 2 == 1) {
                oddList.add(i);
            }
            i++;
        } while (i <= 50);
        log.info("{} - Loop DoWhile", oddList);
        return oddList;
    }

}
