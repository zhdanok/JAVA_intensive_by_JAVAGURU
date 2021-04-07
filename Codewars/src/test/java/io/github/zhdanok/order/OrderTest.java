package io.github.zhdanok.order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    Order order;

    @BeforeEach
    void setUp() {
        order = new Order();
    }

    @Test
    void orderTheString1() {
        String str = "is2 Thi1s T4est 3a";
        String actual = order.order(str);
        String expected = "Thi1s is2 3a T4est";
        assertEquals(expected, actual);
    }

    @Test
    void orderTheString2() {
        String str = "4of Fo1r pe6ople g3ood th5e the2";
        String actual = order.order(str);
        String expected = "Fo1r the2 g3ood 4of th5e pe6ople";
        assertEquals(expected, actual);
    }

    @Test
    void orderTheString3() {
        String str = "Empty input should return empty string";
        String actual = order.order(str);
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    void orderTheString4() {
        String str = "";
        String actual = order.order(str);
        String expected = "";
        assertEquals(expected, actual);
    }
}