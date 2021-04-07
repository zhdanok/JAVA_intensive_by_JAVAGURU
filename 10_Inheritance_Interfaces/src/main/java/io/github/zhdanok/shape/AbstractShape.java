package io.github.zhdanok.shape;

public abstract class AbstractShape implements Shape {

    String name;
    double length;
    double width;
    double radius;
    double firstSide;
    double secondSide;
    double thirdSide;


    public AbstractShape(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public AbstractShape(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public AbstractShape(String name, double firstSide, double secondSide, double thirdSide) {
        this.name = name;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void printAnswer() {
        System.out.println(String.format("Area of %s is %.2f", getName(), gerArea()));
    }




}
