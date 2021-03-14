package io.github.zhdanok.service;

import io.github.zhdanok.bean.Circle;
import io.github.zhdanok.exeptions.NegativeValueExeption;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleDemoTest {

    Circle circle = new Circle();
    CircleDemo circleDemo = new CircleDemo();

    @Test
    void calcArea() throws NegativeValueExeption {
        circle.setRadius(3.2);
        double actual = circleDemo.calculateArea(circle.getRadius());
        double expected = 16.0849;
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    void calcAreaNegativeValue() {
        assertThrows(NegativeValueExeption.class, () -> {
            circle.setRadius(-2.0);
            double actual = circleDemo.calculateArea(circle.getRadius());
        });
    }

}