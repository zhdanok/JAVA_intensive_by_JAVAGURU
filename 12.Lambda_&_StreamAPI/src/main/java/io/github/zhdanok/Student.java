package io.github.zhdanok;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private Integer id;
    private String firstName;
    private String lastName;
    private Double awgReiting;


    public Student() {
    }

    public Student(Integer id, String firstName, String lastName, Double awgReiting) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.awgReiting = awgReiting;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getAwgReiting() {
        return awgReiting;
    }

    public void setAwgReiting(Double awgReiting) {
        this.awgReiting = awgReiting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(awgReiting, student.awgReiting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, awgReiting);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", awgReiting=" + awgReiting +
                '}';
    }

    @Override
    public int compareTo(@org.jetbrains.annotations.NotNull Student o) {
        if (this.id.equals(o.id)) {
            if (this.firstName.compareTo(o.firstName) == 0) {
                if (this.lastName.compareTo(o.lastName) == 0) {
                    return (int) ((this.awgReiting - o.awgReiting) * 10);
                }
                return (this.lastName.compareTo(o.lastName));
            }
            return (this.firstName.compareTo(o.firstName));
        }
        return (this.id - o.id);
    }
}
