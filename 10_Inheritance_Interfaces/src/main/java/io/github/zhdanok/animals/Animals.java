package io.github.zhdanok.animals;

import java.util.Objects;

public class Animals {

    protected String type;

    public Animals(String type) {
        this.type = type;

    }

    public void eating() {
        System.out.println(String.format("%s eating meal", this.type));
    }

    protected void sleeping() {
        System.out.println(String.format("%s sleeping \" hrrrr\" ", this.type));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return Objects.equals(type, animals.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "type='" + type + '\'' +
                '}';
    }
}
