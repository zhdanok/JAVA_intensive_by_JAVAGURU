package io.github.zhdanok.servise;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    Logger logger = LoggerFactory.getLogger(CarServiceTest.class);

    CarService carService = new CarService();



    @Test
    void accelerate() {
        logger.info("{}", carService.car.toString());
        int targetSpeed = 10;
        int actuale = carService.accelerate(targetSpeed);
        assertEquals(targetSpeed, actuale);
        logger.info("{}", carService.car.toString());
    }

    @Test
    void accelerateMoreMax() {
        logger.info("{}", carService.car.toString());
        int targetSpeed = 500;
        int actuale = carService.accelerate(targetSpeed);
        assertEquals(400, actuale);
        logger.info("{}", carService.car.toString());
    }

    @Test
    void accelerateLessCurrent() {
        carService.car.setCurrentSpeed(250);
        logger.info("{}", carService.car.toString());
        int targetSpeed = 170;
        int actuale = carService.accelerate(targetSpeed);
        assertEquals(250, actuale);
        logger.info("{}", carService.car.toString());
    }

    @Test
    void decelerate() {
        carService.car.setCurrentSpeed(250);
        logger.info("{}", carService.car.toString());
        int targetSpeed = 170;
        int actuale = carService.decelerate(targetSpeed);
        assertEquals(targetSpeed, actuale);
        logger.info("{}", carService.car.toString());
    }

    @Test
    void decelerateLessZero() {
        carService.car.setCurrentSpeed(250);
        logger.info("{}", carService.car.toString());
        int targetSpeed = -3;
        int actuale = carService.decelerate(targetSpeed);
        assertEquals(0, actuale);
        logger.info("{}", carService.car.toString());
    }

    @Test
    void decelerateMoreCurrent() {
        carService.car.setCurrentSpeed(250);
        logger.info("{}", carService.car.toString());
        int targetSpeed = 300;
        int actuale = carService.decelerate(targetSpeed);
        assertEquals(250, actuale);
        logger.info("{}", carService.car.toString());
    }

    @Test
    void isDrivingPositive() {
        carService.car.setCurrentSpeed(250);
        logger.info("{}", carService.car.toString());
        boolean actuale = carService.isDriving(carService.car);
        assertEquals(true, actuale);
    }

    @Test
    void isDrivingNegative() {
        carService.car.setCurrentSpeed(0);
        logger.info("{}", carService.car.toString());
        boolean actuale = carService.isDriving(carService.car);
        assertEquals(false, actuale);
    }

    @Test
    void isStoppedPositive() {
        carService.car.setCurrentSpeed(0);
        logger.info("{}", carService.car.toString());
        boolean actuale = carService.isStopped(carService.car);
        assertEquals(true, actuale);
    }

    @Test
    void isStoppedNegative() {
        carService.car.setCurrentSpeed(15);
        logger.info("{}", carService.car.toString());
        boolean actuale = carService.isStopped(carService.car);
        assertEquals(false, actuale);
    }

    @Test
    void canAcceleratePositive() {
        carService.car.setCurrentSpeed(275);
        logger.info("{}", carService.car.toString());
        boolean actuale = carService.canAccelerate(carService.car);
        assertEquals(true, actuale);
    }

    @Test
    void canAccelerateNegative() {
        carService.car.setCurrentSpeed(400);
        logger.info("{}", carService.car.toString());
        boolean actuale = carService.canAccelerate(carService.car);
        assertEquals(false, actuale);
    }
}