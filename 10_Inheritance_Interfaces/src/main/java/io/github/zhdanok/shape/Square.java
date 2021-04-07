package io.github.zhdanok.shape;

public class Square extends AbstractShape{

    public Square(String name, double length, double width) {
        super(name, length, width);
    }

    @Override
    public double gerArea() {
        return length * width;
    }
}
