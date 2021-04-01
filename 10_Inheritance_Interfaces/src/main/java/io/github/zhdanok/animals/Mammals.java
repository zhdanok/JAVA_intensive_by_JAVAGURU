package io.github.zhdanok.animals;


import java.util.Objects;

public class Mammals extends Animals {

    protected int numberOfLegs;

    public Mammals(String type, int numberOfLegs) {
        super(type);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    protected void sleeping() {
        System.out.println(String.format("%S sleeping \" HRRRRRRR\" ", this.type));

    }

    protected void saying() {
        System.out.println(String.format("%S say \" any voices\" ", this.type));
    }

    public void jogging() {
        System.out.println(String.format("%S jogging with their %d legs ", this.type, this.numberOfLegs));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return numberOfLegs == mammals.numberOfLegs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfLegs);
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "type='" + type + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }
}

