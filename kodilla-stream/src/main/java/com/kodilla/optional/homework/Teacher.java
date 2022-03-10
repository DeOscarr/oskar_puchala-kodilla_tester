package com.kodilla.optional.homework;

import java.util.Objects;

public class Teacher {
    String teachersName;

    public Teacher(String teachersName) {
        this.teachersName = teachersName;
    }

    public String getTeachersName() {
        return teachersName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(teachersName, teacher.teachersName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teachersName);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teachersName='" + teachersName + '\'' +
                '}';
    }
}