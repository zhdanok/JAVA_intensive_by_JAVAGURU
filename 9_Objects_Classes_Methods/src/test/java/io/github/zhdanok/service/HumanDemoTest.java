package io.github.zhdanok.service;

import io.github.zhdanok.bean.Human;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanDemoTest {

    Human human = new Human("Alex", 35);
    HumanDemo humanDemo = new HumanDemo(human);

    @Test
    void greetTest() {
        humanDemo.greet(human);
        assertTrue(humanDemo.logger.isInfoEnabled());

    }
}