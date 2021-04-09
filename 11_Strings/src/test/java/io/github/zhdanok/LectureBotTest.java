package io.github.zhdanok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class LectureBotTest {

    Logger logger = LoggerFactory.getLogger(LectureBotTest.class);

    @Spy
    LectureBot lectureBot;

    @BeforeEach
    void setUp() {
        lectureBot = new LectureBot();
    }

    @Test
    void createText() {
        String text1 = lectureBot.createText();
        logger.info("{}", text1);
        String text2 = lectureBot.createText();
        logger.info("{}", text2);
        assertNotEquals(text1, text2);
    }
}