package io.github.zhdanok.animals;

public class Parrot extends Bird{

    public Parrot(String type, boolean isCanSpeak) {
        super(type, isCanSpeak);
    }

    @Override
    protected void sleeping() {
        System.out.println(String.format("%S sleeping into the cage", this.type));
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "type='" + type + '\'' +
                ", isCanSpeak=" + isCanSpeak +
                '}';
    }
}
