package io.github.zhdanok.animals;

import java.util.Objects;

public class Cat extends Mammals{

    private String voice;

    private  String favoriteMeal;

    public Cat(String type, int numberOfLegs, String voice, String favoriteMeal) {
        super(type, numberOfLegs);
        this.voice = voice;
        this.favoriteMeal = favoriteMeal;
    }

    @Override
    public void eating() {
        System.out.println(String.format("%s eating %s", this.type, this.favoriteMeal));
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
        Cat cat = (Cat) o;
        return Objects.equals(voice, cat.voice) && Objects.equals(favoriteMeal, cat.favoriteMeal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), voice, favoriteMeal);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", favoriteMeal='" + favoriteMeal + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }
}
