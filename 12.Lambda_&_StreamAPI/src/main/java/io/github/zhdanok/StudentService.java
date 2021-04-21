package io.github.zhdanok;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class StudentService {

    //КОМПАРАТОР НА СТРИМАХ

    public static final Comparator<Student> BY_ID = comparing(Student::getId);
    public static final Comparator<Student> BY_NAME = comparing(Student::getFirstName);
    public static final Comparator<Student> BY_LASTNAME = comparing(Student::getLastName);
    public static final Comparator<Student> BY_AVG_REITING = comparing(Student::getAwgReiting);

    public static List<Student> sortByAllStream(List<Student> students) {
        return students.stream()
                .sorted(BY_ID.thenComparing(BY_NAME.thenComparing(BY_LASTNAME.thenComparing(BY_AVG_REITING))))
                .collect(Collectors.toList());
    }

    public static List<Student> sortByNameStream(List<Student> students) {
        return students.stream().sorted(BY_NAME).collect(Collectors.toList());
    }


    //КОМПАРАТОР ОБЫЧНЫЙ

    public static void sort(List<Student> students) {
        Collections.sort(students);
    }

    public static void sortByName(List<Student> students) {
        Collections.sort(students, new CompareByName());
    }

    public static void sortByAll(List<Student> students) {
        Collections.sort(students, new ComparatorByAll());
    }

    public static class ComparatorByAll implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.getId().equals(o2.getId())) {
                if (o1.getFirstName().compareTo(o2.getFirstName()) == 0) {
                    if (o1.getLastName().compareTo(o2.getLastName()) == 0) {
                        return (int) ((o1.getAwgReiting() - o2.getAwgReiting()) * 10);
                    }
                    return (o1.getLastName().compareTo(o2.getLastName()));
                }
                return (o1.getFirstName().compareTo(o2.getFirstName()));
            }
            return (o1.getId() - o2.getId());
        }
    }

    public static class CompareByName implements Comparator<Student> {


        @Override
        public int compare(Student o1, Student o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }

}
