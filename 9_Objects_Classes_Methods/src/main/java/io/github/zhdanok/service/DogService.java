package io.github.zhdanok.service;

import io.github.zhdanok.bean.Dog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DogService {

    Logger logger = LoggerFactory.getLogger(DogService.class);


    public DogService(Dog dog) {

    }

    public void voice() {
        String message = "Gav! Gav!";
        logger.info("{}", message);
    }

    public void eat() {
        String message = "Yam-yam!";
        logger.info("{}", message);
    }

    public void sleep() {
        String message = "Hrrrr.... Hrrr....";
        logger.info("{}", message);
    }
}
