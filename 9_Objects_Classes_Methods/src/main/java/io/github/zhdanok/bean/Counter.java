package io.github.zhdanok.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.github.zhdanok.constants.Constants.*;

public class Counter {
    private int value;
    private int step;


    public Counter() {
        this.value = 0;
        this.step = 1;
    }

    Logger logger = LoggerFactory.getLogger(Counter.class);

    public void increment() {
        if ((getValue() + getStep()) < Integer.valueOf(COUNTER_MAX)) {
            setValue(getValue() + getStep());
        }
    }

    public void decrement() {
        if ((getValue() - getStep()) > Integer.valueOf(COUNTER_MIN)) {
            setValue(getValue() - getStep());
        }
    }

    public void reset() {
        Counter resetCounter = new Counter();
        setValue(resetCounter.getValue());
        setStep(resetCounter.getStep());
    }

    public void setValue(int value) {
        if (value >= Integer.valueOf(COUNTER_MIN) && value <= Integer.valueOf(COUNTER_MAX)) {
            this.value = value;
        } else logger.info("Set the value in the range from 0 to 100");
    }

    public int getValue() {
        return value;
    }

    public void setStep(int step) {
        if (step >= Integer.valueOf(STEP_MIN) && step <= Integer.valueOf(STEP_MAX)) {
            this.step = step;
        } else logger.info("Set the step in the range from 1 to 10");
    }

    public int getStep() {
        return step;
    }

}
