package io.github.zhdanok.animals;

import java.util.Objects;

public class Bird  extends  Animals{

    protected boolean isCanSpeak;

    public Bird(String type, boolean isCanSpeak) {
        super(type);
        this.isCanSpeak = isCanSpeak;
    }

    public void letsSpeak() {
        if (this.isCanSpeak) {
            System.out.println(String.format("%S can speak like people", this.type));
        }
    }

    @Override
    public void eating() {
        System.out.println(String.format("%s eating corn", this.type));
    }

    @Override
    protected void sleeping() {
        System.out.println(String.format("%S sleeping on the branch", this.type));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return isCanSpeak == bird.isCanSpeak;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isCanSpeak);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "type='" + type + '\'' +
                ", isCanSpeak=" + isCanSpeak +
                '}';
    }
}
