package io.github.zhdanok.service;

import io.github.zhdanok.bean.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductDemo {

    Logger logger = LoggerFactory.getLogger(ProductDemo.class);


    public double actualPrice(Product product) {
        return (product.getRegularPrice() - (product.getRegularPrice() * product.getDiscount() / 100));
    }

    public void print(Product product) {
        logger.info("{}, actualPrice = {} BYN", product,actualPrice(product));
    }
}
