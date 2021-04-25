package io.github.zhdanok.animals;

import java.util.Comparator;
import java.util.Objects;

public class Person  {
    String name;
    String serName;

    public Person(String name, String serName) {
        this.name = name;
        this.serName = serName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerName() {
        return serName;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(serName, person.serName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serName);
    }

    @Override
    public String toString() {
        return
                "(" + serName + ", " +
                name+ ")" ;
    }


}
