package io.github.zhdanok.shape;

public class ShapeDemo {

    public static void main(String[] args) {
        AbstractShape[] shapes = {
                new Circle("circle", 3.),
                new Square("square", 5., 3.5),
                new Triangle("triangle", 3., 4.0, 5.)
        };

        for (AbstractShape s:
             shapes) {
            s.printAnswer();
        }
    }
}
