package io.github.zhdanok.service;

import io.github.zhdanok.bean.Dog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogServiceTest {

    Dog dog = new Dog(5,"white", "Bim");
    DogService dogService = new DogService(dog);;

    @Test
    void voiceTest() {
        dogService.voice();
        assertTrue(dogService.logger.isInfoEnabled());
    }

    @Test
    void eatTest() {
        dogService.eat();
        assertTrue(dogService.logger.isInfoEnabled());
    }

    @Test
    void sleepTest() {
        dogService.sleep();
        assertTrue(dogService.logger.isInfoEnabled());
    }
}