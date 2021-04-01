package io.github.zhdanok.animals;

import java.util.Objects;

public class Dog extends Mammals {

    private String voice;

    public Dog(String type, int numberOfLegs, String voice) {
        super(type, numberOfLegs);
        this.voice = voice;
    }


    @Override
    public void eating() {
        System.out.println(String.format("%s eating beef", this.type));
    }


    @Override
    protected void saying() {
        System.out.println(String.format("%S say %S ", this.type, this.voice));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(voice, dog.voice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), voice);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                ", voice='" + voice + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }
}
