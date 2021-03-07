package io.github.zhdanok.servise;

import io.github.zhdanok.bean.Product;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Shop {

    Set<Product> assortment = new HashSet<>();

    public void addProduct(Product pr) {
        assortment.add(pr);
    }

    public void deleteProduct(Product pr) {
        assortment.remove(pr);
    }

    public Product findProductByName(String nameOfProduct) {
        for (Product product : assortment) {
            if (product.getNameOfProduct().equals(nameOfProduct)) {
                return product;
            }
        }
        return null;
    }

    public Set<Product> findProductInRange(BigDecimal min, BigDecimal max) {
        Set<Product> result = new HashSet<>();
        for (Product product : assortment) {
            BigDecimal a = product.getPrice();
            if ((a.compareTo(min) >= 0)  && (a.compareTo(max)) <= 0) {
                result.add(product);
            }
        }
        return result;
    }
}
