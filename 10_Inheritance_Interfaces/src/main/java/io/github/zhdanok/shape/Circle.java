package io.github.zhdanok.shape;

public class Circle  extends  AbstractShape{

    public Circle(String name, double radius) {
        super(name, radius);
    }

    @Override
    public double gerArea() {
        return (Math.PI * radius * radius);
    }




}
