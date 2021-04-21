package io.github.zhdanok;


import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    void compareWithComparable() {
        List<Student> students = Arrays.asList(
                new Student(1234, "Liudmila", "Zhdanok", 8.7),
                new Student(1234, "Artsemij", "Zhdanok", 8.2),
                new Student(1234, "Liudmila", "Kutepova", 10.0),
                new Student(5790, "Nadejda", "Kutepova", 9.4)
        );

        Collections.sort(students);

        List<Student> expected = Arrays.asList(
                new Student(1234, "Artsemij", "Zhdanok", 8.2),
                new Student(1234, "Liudmila", "Kutepova", 10.0),
                new Student(1234, "Liudmila", "Zhdanok", 8.7),
                new Student(5790, "Nadejda", "Kutepova", 9.4)
        );

        assertEquals(expected, students);

        Student student1 = new Student(1234, "Ziudmila", "Zhdanok", 8.7);
        Student student2 = new Student(1234, "Artsemij", "Zhdanok", 8.2);

        assertTrue(student1.compareTo(student2) > 0);

    }

    @Test
    void compareWithComparatorByName() {
        List<Student> students = Arrays.asList(
                new Student(1234, "Liudmila", "Zhdanok", 8.7),
                new Student(1234, "Artsemij", "Zhdanok", 8.2),
                new Student(1234, "Ziudmila", "Kutepova", 10.0),
                new Student(5790, "Nadejda", "Kutepova", 9.4)
        );

        //StudentService.sortByName(students); - КОМПАРАТОР ОБЫЧНЫЙ
        List<Student> actual = StudentService.sortByNameStream(students); // - КОМПАРАТОР НА СТРИМАХ

        List<Student> expected = Arrays.asList(
                new Student(1234, "Artsemij", "Zhdanok", 8.2),
                new Student(1234, "Liudmila", "Zhdanok", 8.7),
                new Student(5790, "Nadejda", "Kutepova", 9.4),
                new Student(1234, "Ziudmila", "Kutepova", 10.0)
        );

        //assertEquals(expected, students);
        assertEquals(expected, actual);
    }

    @Test
    void compareWithComparatorByAll() {
        List<Student> students = Arrays.asList(
                new Student(1234, "Liudmila", "Zhdanok", 8.7),
                new Student(1234, "Artsemij", "Zhdanok", 8.2),
                new Student(1234, "Liudmila", "Kutepova", 10.0),
                new Student(5790, "Nadejda", "Kutepova", 9.4),
                new Student(1234, "Liudmila", "Kutepova", 5.4)
        );

        //StudentService.sortByAll(students); - КОМПАРАТОР ОБЫЧНЫЙ
        List<Student> actual = StudentService.sortByAllStream(students); // - КОМПАРАТОР НА СТРИМАХ

        List<Student> expected = Arrays.asList(
                new Student(1234, "Artsemij", "Zhdanok", 8.2),
                new Student(1234, "Liudmila", "Kutepova", 5.4),
                new Student(1234, "Liudmila", "Kutepova", 10.0),
                new Student(1234, "Liudmila", "Zhdanok", 8.7),
                new Student(5790, "Nadejda", "Kutepova", 9.4)
        );

        //assertEquals(expected, students);
        assertEquals(expected, actual);
    }
}