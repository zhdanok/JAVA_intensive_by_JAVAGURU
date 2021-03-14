package io.github.zhdanok.service;


import io.github.zhdanok.exeptions.NegativeValueExeption;

public class CircleDemo {


    public double calculateArea(double radius) throws NegativeValueExeption {
        if (radius >= 0.) {
            double area = Math.PI * radius * radius / 2.0;
            return area;
        } else throw new NegativeValueExeption();
    }
}
