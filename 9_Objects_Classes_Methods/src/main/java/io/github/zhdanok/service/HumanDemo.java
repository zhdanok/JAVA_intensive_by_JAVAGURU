package io.github.zhdanok.service;

import io.github.zhdanok.bean.Human;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HumanDemo {
    public HumanDemo(Human human) {}

    Logger logger = LoggerFactory.getLogger(HumanDemo.class);

    public void greet(Human human) {
        logger.info("Hi! My name is {}, I'm {} years old", human.getName(), human.getAge() );
    }
}
