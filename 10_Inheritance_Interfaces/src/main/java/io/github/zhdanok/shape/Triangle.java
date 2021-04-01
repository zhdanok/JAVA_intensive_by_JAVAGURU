package io.github.zhdanok.shape;

public class Triangle extends AbstractShape{

    public Triangle(String name, double firstSide, double secondSide, double thirdSide) {
        super(name, firstSide, secondSide, thirdSide);
    }

    @Override
    public double gerArea() {
        double p = (firstSide + secondSide + thirdSide) / 2.0;
        return (Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide)));
    }
}
