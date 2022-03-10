package com.kodilla.optional.homework;

import java.util.ArrayList; //nie wiem czemu nie dziala
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();
        students.add(new Student("Oskar", new Teacher("Robert Kub")));
        students.add(new Student("Mateusz", new Teacher("Kamil Cyg")));
        students.add(new Student("Szymon", null));
        students.add(new Student("Maciej", null));


        for (Student student : students) { //TODO
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teachersName = optionalTeacher.map(Teacher::getTeachersName).orElse("<undefined>");
//            orElse(new Teacher("<undefined>")).getTeachersName(); czemu to nie dzialalo?
            System.out.println("Student: " + student.getName() + ", teacher: " + teachersName + "."); //nie dziala
        }

        //for (Student studentx : students)
        //{
        //Teacher teacher = Optional.ofNullable(studentx.getTeacher()).orElse(new Teacher("<undefined>"));
        // System.out.println(teacher);
        //System.out.println("Student: " + studentx.getName() + ", teacher: " + teacher.getTeachersName() + ".");}
        //}
    }
}