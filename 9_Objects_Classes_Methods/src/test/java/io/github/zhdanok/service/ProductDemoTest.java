package io.github.zhdanok.service;

import io.github.zhdanok.bean.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductDemoTest {

    ProductDemo productDemo;
    Product product;

    @BeforeEach
    void setUp() {
        productDemo = new ProductDemo();
        product = new Product("xiaomi mi 9t");
        product.setRegularPrice(1100.0);
        product.setDiscount(27.5);
    }


    @Test
    void actualPriceTest() {
        double actual = productDemo.actualPrice(product);
        double expected = 797.5;
        assertEquals(expected, actual);
    }

    @Test
    void printInformation() {
        productDemo.print(product);
        assertEquals("xiaomi mi 9t", product.getName());
    }

}