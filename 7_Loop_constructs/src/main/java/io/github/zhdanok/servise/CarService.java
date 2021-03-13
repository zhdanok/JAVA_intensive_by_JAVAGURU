package io.github.zhdanok.servise;

import io.github.zhdanok.bean.Car;

public class CarService {

    Car car = new Car("BMV", "black", 400);


    public int accelerate(int targetSpeed) {
        if (targetSpeed < car.getCurrentSpeed()) {
            return car.getCurrentSpeed();
        } else if (targetSpeed >= car.getMaxSpeed()) {
            targetSpeed = car.getMaxSpeed();
        }
        for (int i = car.getCurrentSpeed(); i < targetSpeed; i++) {
            car.setCurrentSpeed(car.getCurrentSpeed() + 1);
        }
        return car.getCurrentSpeed();
    }

    public int decelerate(int targetSpeed) {
        if (targetSpeed > car.getCurrentSpeed()) {
            return car.getCurrentSpeed();
        } else if (targetSpeed < 0) {
            targetSpeed = 0;
        }
        for (int i = car.getCurrentSpeed(); i > targetSpeed; i--) {
            car.setCurrentSpeed(car.getCurrentSpeed() - 1);
        }
        return car.getCurrentSpeed();
    }

    public boolean isDriving(Car car) {
        if (car.getCurrentSpeed() > 0) {
            return true;
        } else
        return false;
    }

    public boolean isStopped(Car car) {
        if (car.getCurrentSpeed() == 0) {
            return true;
        } else
            return false;
    }

    public boolean canAccelerate(Car car) {
        if (car.getCurrentSpeed() < car.getMaxSpeed()) {
            return true;
        } else
            return false;
    }
}

