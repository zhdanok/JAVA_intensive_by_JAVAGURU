package io.github.zhdanok.animals;

import java.util.*;



public class Codewars {

    Comparator<Person> BY_NAME = Comparator.comparing(Person::getName);
    Comparator<Person> BY_SERNAME = Comparator.comparing(Person::getSerName);


    public String meeting(String s) {
        List<Person> list = new ArrayList<>();
        String result = "";
        String[] strings = s.toUpperCase().split(";");
        for (int i = 0; i < strings.length; i++) {
            String[] persons = strings[i].split(":");
            list.add(new Person(persons[0], persons[1] ));
        }

        Collections.sort(list, BY_SERNAME.thenComparing(BY_NAME));

        for (Person p :
                list) {
            result += p.toString();
        }
        return result;
    }


}
