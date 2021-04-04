package io.github.zhdanok.bean;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    Counter counter;

    @BeforeEach
    void setUp() {

        counter = new Counter();
    }

    @Test
    void incrementTest() {
        assertEquals(0, counter.getValue());
        counter.increment();
        assertEquals(1, counter.getValue());
        counter.increment();
        counter.increment();
        assertEquals(3, counter.getValue());
    }

    @Test
    void incrementTestNegative() {
        counter.setValue(97);
        counter.setStep(2);
        counter.increment();
        assertEquals(99, counter.getValue());
        counter.increment();
        assertEquals(99, counter.getValue());
        assertNotEquals(101, counter.getValue());
    }

    @Test
    void decrementTest() {
        counter.setValue(5);
        counter.setStep(1);
        counter.decrement();
        assertEquals(4, counter.getValue());
        counter.decrement();
        counter.decrement();
        assertEquals(2, counter.getValue());
    }

    @Test
    void decrementTestNegative() {
        counter.setValue(5);
        counter.setStep(3);
        counter.decrement();
        assertEquals(2, counter.getValue());
        counter.decrement();
        assertEquals(2, counter.getValue());
        assertNotEquals(-1, counter.getValue());
    }

    @Test
    void resetTest() {
        counter.setValue(15);
        counter.setStep(5);
        counter.reset();
        assertEquals(0, counter.getValue());
        assertEquals(1, counter.getStep());
    }

    @Test
    void setValueTest() {
        counter.setValue(15);
        int actuale = counter.getValue();
        assertEquals(15, actuale);
    }

    @Test
    void setValueTestNegative() {
        counter.setValue(115);
        int actuale = counter.getValue();
        assertEquals(0, actuale);
    }

    @Test
    void setStepTest() {
        counter.setStep(3);
        int actuale = counter.getStep();
        assertEquals(3, actuale);
    }

    @Test
    void setStepTestNegative() {
        counter.setStep(-2);
        int actuale = counter.getStep();
        assertEquals(1, actuale);
    }


}