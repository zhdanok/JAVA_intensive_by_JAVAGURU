package io.github.zhdanok.bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {
    private String nameOfProduct;
    private BigDecimal price;

    public Product(String nameOfProduct, BigDecimal price) {
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameOfProduct, product.nameOfProduct) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfProduct, price);
    }

    @Override
    public String toString() {
        return "Product " + nameOfProduct +
                ", price=" + price + "BYN";
    }
}
