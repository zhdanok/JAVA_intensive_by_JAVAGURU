package io.github.zhdanok.servise;

import io.github.zhdanok.bean.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.math.BigDecimal;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {

    Logger logger = LoggerFactory.getLogger(ShopTest.class);

    Shop shop = new Shop();

    @BeforeEach
    void beforeTest() {
        shop.addProduct(new Product("butter", new BigDecimal("3.25")));
        shop.addProduct(new Product("milk", new BigDecimal("2.15")));
        shop.addProduct(new Product("bred", new BigDecimal("2.4")));
        shop.addProduct(new Product("apple", new BigDecimal("2.99")));
        shop.addProduct(new Product("juice", new BigDecimal("4.5")));
        shop.addProduct(new Product("spaghetti", new BigDecimal("3.75")));
        shop.addProduct(new Product("rise", new BigDecimal("2.90")));
        shop.addProduct(new Product("tea", new BigDecimal("4.80")));
        shop.addProduct(new Product("coffee", new BigDecimal("13.5")));
        shop.addProduct(new Product("tomato", new BigDecimal("7.18")));
        shop.addProduct(new Product("oil", new BigDecimal("5.3")));
        shop.addProduct(new Product("onion", new BigDecimal("0.49")));
    }

    @Test
    void addProduct() {
        Product expected = new Product("vino", new BigDecimal("35.17"));
        shop.addProduct(expected);
        assertTrue(shop.assortment.contains(expected));
        logger.info("{} is successfully added to assortment", expected);
    }

    @Test
    void deleteProduct() {
        Product expected = new Product("tomato", new BigDecimal("7.18"));
        shop.deleteProduct(expected);
        assertFalse(shop.assortment.contains(expected));
        logger.info("{} is successfully deleted from assortment", expected);
    }

    @Test
    void findProductByName() {
        String nameOfProduct = "juice";
        Product actuale = shop.findProductByName(nameOfProduct);
        Product expected = new Product("juice", new BigDecimal("4.5"));
        assertEquals(expected, actuale);
        logger.info("You finded {}", actuale);
    }

    @Test
    void findProductInRange() {
        BigDecimal minPriceRange = new BigDecimal("2.0");
        BigDecimal maxPriceRange = new BigDecimal("2.99");
        Set<Product> actuale = shop.findProductInRange(minPriceRange, maxPriceRange);
        Set<Product> expected = new HashSet<>();
        expected.add(new Product("milk", new BigDecimal("2.15")));
        expected.add(new Product("bred", new BigDecimal("2.4")));
        expected.add(new Product("apple", new BigDecimal("2.99")));
        expected.add(new Product("rise", new BigDecimal("2.90")));
        assertEquals(expected, actuale);
        logger.info("You finded {}", actuale);
    }


}